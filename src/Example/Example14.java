package Example;

/**
 * Created by anonymous on 11/16/2016.
 */
import util.*;
import generics.myCoffee.*;
public class Example14 {
    public static void main(String[] args){
        Generator<CountedObject> generator = new BasicGenerator<>(CountedObject.class);
        for(int i = 1; i < 10; i++){
            System.out.println(generator.next());
        }
    }
}
