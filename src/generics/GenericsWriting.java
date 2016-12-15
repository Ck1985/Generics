package generics;

/**
 * Created by anonymous on 12/15/2016.
 */
import java.util.*;

public class GenericsWriting {
    static <T> void writeExact(List<T> list, T item){
        list.add(item);
    }
    static List<Apple> apllesList = new ArrayList<Apple>();
    static List<Fruit> fruitsList = new ArrayList<Fruit>();
    static void f1(){
        writeExact(apllesList, new Apple()); // OK
        writeExact(fruitsList, new Apple());
    }
    static <T> void writeWithWildcard(List<? super T> list, T item){
        list.add(item);
    }
    static void f2(){
        writeWithWildcard(apllesList, new Apple());
        writeWithWildcard(fruitsList, new Apple());
    }
    public static void main(String[] args){
        f1();
        f2();
    }
}
