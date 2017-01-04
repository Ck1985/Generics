package Example;

/**
 * Created by Dell Vostro 5459 on 1/4/2017.
 */
import java.util.*;

interface Processor<T, E extends Exception, F extends Exception>{
    void process(List<T> resultCollector) throws E, F;
}
class ProcessorRunner<T, E extends Exception, F extends Exception> extends ArrayList<Processor<T, E, F>>{
    public List<T> processAll() throws E, F{
        List<T> resultCollector = new ArrayList<T>();
        for(Processor<T, E, F> processor : this){
            try {
                processor.process(resultCollector);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        return resultCollector;
    }
}
class Failure1 extends Exception{}
class Processor1 implements Processor<String, Failure1, Failure2>{
    private static int count = 4;
    public void process(List<String> resultCollector) throws Failure1, Failure2{
        if(count-- > 2){
            resultCollector.add("Help");
        }else if(count-- > 1){
            resultCollector.add("No");
        }else{
            throw new Failure1();
        }
        if(count < 0){
            throw new Failure2();
        }
    }
}
class Failure2 extends Exception{}
class Processor2 implements Processor<Integer, Failure1, Failure3>{
    private static int count = 3;
    public void process(List<Integer> resultCollector) throws Failure1, Failure3{
        if(count-- == 2){
            resultCollector.add(47);
        }else if(count-- == 1){
            resultCollector.add(11);
        }else if(count-- == 0){
            throw new Failure1();
        }else{
            throw new Failure3();
        }
    }
}
class Failure3 extends Exception{}
class Processor3 implements Processor<Float, Failure2, Failure3>{
    private static int count = 2;
    public void process(List<Float> resultCollector) throws Failure2, Failure3{
        if(count-- == 1){
            throw new Failure2();
        }else{
            throw new Failure3();
        }
    }
}
class ThrowGenericException{}
public class Example_36 {
    public static void main(String[] args){
        ProcessorRunner<String, Failure1, Failure2> runner1 = new ProcessorRunner<>();
        for(int i = 1; i < 4; i++){
            runner1.add(new Processor1());
        }
        try {
            System.out.println(runner1.processAll());
        }catch(Failure1 e){
            System.out.println(e);
        }catch(Failure2 e){
            System.out.println(e);
        }

        ProcessorRunner<Integer, Failure1, Failure3> runner2 = new ProcessorRunner<>();
        for(int i = 1; i < 3; i++){
            runner2.add(new Processor2());
        }
        try{
            System.out.println(runner2.processAll());
        }catch(Failure1 e){
            System.out.println(e);
        }catch(Failure3 e){
            System.out.println(e);
        }

        ProcessorRunner<Float, Failure2, Failure3> runner3 = new ProcessorRunner<>();
        for(int i = 1; i < 5; i++){
            runner3.add(new Processor3());
        }
        try{
            System.out.println(runner3.processAll());
        }catch(Failure2 e){
            System.out.println(e);
        }catch(Failure3 e){
            System.out.println(e);
        }
    }
}
