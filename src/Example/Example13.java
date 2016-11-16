package Example;

/**
 * Created by anonymous on 11/16/2016.
 */
import java.util.*;
import generics.myCoffee.*;

public class Example13 {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }
    public static <T> List<T> fill(List<T> list, Generator<T> generator, int n){
        for(int i = 0; i < n; i++){
            list.add(generator.next());
        }
        return list;
    }
    public static <T> Queue<T> fill(Queue<T> queue, Generator<T> generator, int n){
        for(int i = 0; i < n; i++){
            queue.add(generator.next());
        }
        return queue;
    }
    public static <T> Set<T> fill(Set<T> set, Generator<T> generator, int n){
        for(int i = 0; i < n; i++){
            set.add(generator.next());
        }
        return set;
    }
    public static <T> LinkedList<T> fill(LinkedList<T> linkedList, Generator<T> generator, int n){
        for(int i = 0; i < n; i++){
            linkedList.add(generator.next());
        }
        return linkedList;
    }
    public static void main(String[] args){
        List<Coffee> coffeeList = fill(new ArrayList<Coffee>(), new CoffeeGenerator(10), 10);
        System.out.println(coffeeList);
        Queue<Coffee> coffeeQueue = fill(new ArrayDeque<Coffee>(), new CoffeeGenerator(10), 10);
        System.out.println(coffeeQueue);
        Set<Coffee> coffeeSet = fill(new HashSet<Coffee>(), new CoffeeGenerator(10), 10);
        System.out.println(coffeeSet);
        LinkedList<Coffee> coffeeLinkedList = fill(new LinkedList<Coffee>(), new CoffeeGenerator(10), 10);
        System.out.println(coffeeLinkedList);
    }
}
