package generics;

/**
 * Created by anonymous on 1/20/2017.
 */
import java.math.*;
import java.util.*;
import java.util.concurrent.atomic.*;

interface Combiner<T>{
    T combine(T x, T y);
}
interface UnaryFunction<R, T>{
    R function(T x);
}
interface Collector<T> extends UnaryFunction<T, T>{
    T result();
}
interface UnaryPredicate<T>{
    boolean test(T x);
}
public class Functional {
    public static <T> T reduce(Iterable<T> sequence, Combiner<T> combiner){
        Iterator<T> iterator = sequence.iterator();
        if(iterator.hasNext()){
            T result = iterator.next();
            while(iterator.hasNext()){
                combiner.combine(result, iterator.next());
            }
            return result;
        }
        // If sequence is Empty
        return null; // throw Exception....
    }
    public static <T> Collector<T> forEach(Iterable<T> sequence, Collector<T> func){
        for(T t : sequence){
            func.function(t);
        }
        return func;
    }
    public static <R, T> List<R> transform(Iterable<T> sequence, UnaryFunction<R, T> func){
        List<R> result = new ArrayList<>();
        for(T t : sequence){
            result.add(func.function(t));
        }
        return result;
    }
    public static <T> List<T> filter(Iterable<T> sequence, UnaryPredicate<T> pred){
        List<T> result = new ArrayList<>();
        for(T t : sequence){
            if(pred.test(t)){
                result.add(t);
            }
        }
        return result;
    }
    static class IntegerAdder implements Combiner<Integer>{
        public Integer combine(Integer x, Integer y){
            return x + y;
        }
    }
    static class IntegerSubtracter implements Combiner<Integer>{
        public Integer combine(Integer x, Integer y){
            return x - y;
        }
    }
    static class BigDecimalAdder implements Combiner<BigDecimal>{
        public BigDecimal combine(BigDecimal x, BigDecimal y){
            return x.add(y);
        }
    }
    static class AtomicLongAdder implements Combiner<AtomicLong>{
        public AtomicLong combine(AtomicLong x, AtomicLong y){
            return new AtomicLong(x.addAndGet(y.get()));
        }
    }
    static class BigDecimalUlp implements UnaryFunction<BigDecimal, BigDecimal>{
        public BigDecimal function(BigDecimal x){
            return x.ulp();
        }
    }
    static class GreaterThan<T extends Comparable<T>> implements UnaryPredicate<T>{
        private T bound;
        public GreaterThan(T bound){
            this.bound = bound;
        }
        public boolean test(T x){
            return x.compareTo(this.bound) > 0;
        }
    }
    static class MultilIntegercollector<T> implements Collector<Integer>{
        private Integer val = 1;
        public Integer function(Integer x){
            return val *= x;
        }
        public Integer result(){
            return this.val;
        }
    }
    public static void main(String[] args){

    }
}
