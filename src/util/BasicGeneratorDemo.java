package util;

/**
 * Created by anonymous on 11/16/2016.
 */
import generics.coffee.*;
public class BasicGeneratorDemo {
    public static void main(String[] args){
        Generator<CountedObject> generator = BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 10; i++){
            System.out.println(generator.next());
        }
    }
}
