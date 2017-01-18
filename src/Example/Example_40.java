package Example;

/**
 * Created by anonymous on 1/18/2017.
 */
import java.lang.reflect.*;
import java.util.*;
import generics.pets.*;

class ApplyMethodInCollection{
    public static <T, S extends Iterable<? extends T>> void apply(S sequence, Method method, Object... args){
        try{
            for(T item : sequence){
                method.invoke(item, args);
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
public class Example_40 {
    public static void main(String[] args) throws Exception{
        List<Pet> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());
        pets.add(new Cymric());
        pets.add(new EgyptianMau());
        pets.add(new Rat());
        pets.add(new Rodent());
        pets.add(new Pug());
        pets.add(new Manx());
        pets.add(new Rat());
        ApplyMethodInCollection.apply(pets, Pet.class.getMethod("speak"));
    }
}
