package Example;

import generics.fibonacy.IterableCompositionFibonacci;

/**
 * Created by anonymous on 11/14/2016.
 */
public class Example7 {
    public static void main(String[] args){
        IterableCompositionFibonacci fibonacci = new IterableCompositionFibonacci(15);
        for(Integer number : fibonacci){
            System.out.print(number + " ");
        }
    }
}
