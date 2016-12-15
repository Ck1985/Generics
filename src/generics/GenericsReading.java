package generics;

/**
 * Created by anonymous on 12/15/2016.
 */
import java.util.*;

public class GenericsReading {
    static <T> T readExact(List<T> list){
        return list.get(0);
    }
    static List<Apple> appleList = Arrays.asList(new Apple());
    static List<Fruit> fruitList = Arrays.asList(new Fruit());
    static void f1(){
        Apple apple = readExact(appleList);
        Fruit fruit = readExact(fruitList);
        fruit = readExact(appleList);
    }
    static class Reader<T>{
        T readExact(List<T> list){
            return list.get(0);
        }
    }
    static void f2(){
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit fruit = fruitReader.readExact(fruitList);

    }
    public static void main(String[] args){

    }
}
