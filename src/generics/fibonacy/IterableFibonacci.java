package generics.fibonacy;

import java.util.Iterator;

/**
 * Created by anonymous on 11/14/2016.
 */
public class IterableFibonacci extends Fibonacy implements Iterable<Integer> {
    private int count;
    public IterableFibonacci(int count){
        this.count = count;
    }
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            public boolean hasNext(){
                return (count > 0);
            }
            public Integer next(){
                count--;
                return IterableFibonacci.this.next();
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        for(Integer number : new IterableFibonacci(10)){
            System.out.print(number + " ");
        }
    }
}
