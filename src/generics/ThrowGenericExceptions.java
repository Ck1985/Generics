package generics;

/**
 * Created by anonymous on 1/3/2017.
 */
import java.util.*;

interface Processor<T, E extends Exception>{
    void process(List<T> resultCollector) throws E;
}
class ProcessorRunner<T, E extends Exception> extends ArrayList<Processor<T, E>>{
    List<T> processAll() throws E{
        List<T> resultCollector = new ArrayList<T>();
        for(Processor<T, E> processor : this){
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}
class Failure1 extends Exception{}
class Processor1 implements Processor<String, Failure1>{
    static int count = 3;
    public void process(List<String> resultCollector)throws Failure1{
        if(count-- > 1){
            resultCollector.add("Help");
        }else{
            resultCollector.add("No");
        }
        if(count < 0){
            throw new Failure1();
        }
    }
}
class Failure2 extends Exception{}
class Processor2 implements Processor<Integer, Failure2>{
    static int count = 2;
    public void process(List<Integer> resultCollector) throws Failure2{
        if(count-- == 0){
            resultCollector.add(47);
        }else{
            resultCollector.add(11);
        }
        if(count < 0){
            throw new Failure2();
        }
    }
}
public class ThrowGenericExceptions {
    public static void main(String[] args){
        ProcessorRunner<String, Failure1> runner1 = new ProcessorRunner<>();
        for(int i = 0; i < 3; i++){
            runner1.add(new Processor1());
        }
        try {
            System.out.println(runner1.processAll());
        }catch(Failure1 failure1){
            System.out.println(failure1);
        }
        ProcessorRunner<Integer, Failure2> runner2 = new ProcessorRunner<>();
        for(int i = 1; i < 3; i++){
            runner2.add(new Processor2());
        }
        try{
            System.out.println(runner2.processAll());
        }catch(Failure2 failuer2){
            System.out.println(failuer2);
        }
    }
}
