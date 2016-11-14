package generics.fibonacy;

/**
 * Created by anonymous on 11/14/2016.
 */
import java.util.*;

public class IterableCompositionFibonacci implements Iterable<Integer>{
    private Fibonacy adapterFibonacy = new Fibonacy();
    private int count = 0;
    public IterableCompositionFibonacci(int count){
        this.count = count;
    }
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            public boolean hasNext(){
                return (IterableCompositionFibonacci.this.count > 0);
            }
            public Integer next(){
                IterableCompositionFibonacci.this.count--;
                return adapterFibonacy.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
