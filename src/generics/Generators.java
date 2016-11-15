package generics;
import generics.myCoffee.*;
import java.util.*;
/**
 * Created by anonymous on 11/15/2016.
 */
public class Generators {
    public static <T> Collection<T> collection(Collection<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }
    public static void main(String[] args){
        Collection<Coffee> list = collection(new ArrayList<Coffee>(), new CoffeeGenerator(), 10);
        System.out.println(list);
    }
}
