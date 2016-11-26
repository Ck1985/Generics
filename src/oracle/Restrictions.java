package oracle;

/**
 * Created by anonymous on 11/24/2016.
 */
import java.util.*;

class MathException extends Exception{}
class QueueFullException extends Throwable{}
class MyClass<T>{
    // The static field has type parameyer of class are not allowed
    // private static T field;
    // public MyClass<T>[] array = new MyClass<T>[10];
}
class Pair3<K, V>{
    private K key;
    private V value;
    public Pair3(K key, V value){
        this.key = key;
        this.value = value;
    }
    public static <E> void append(List<E> list){
        // We can instance type parameter directly
        // E e = new E(); Error
    }
    // As a workaround, we can create instance type parameter
    // by using newInstance() method
    public static <E> void append(List<E> list, Class<E> cls) throws Exception{
        E e = cls.newInstance(); // OK
    }
}
// We can use type parameter in throw clause
class Parse<T extends Exception>{
    public void parse(Parse parse) throws T{
        // OK........
    }
    // public static void print(List<String> list){}
    public static void print(List<Integer> list){}
}
public class Restrictions{
    public static <T extends Exception, J> void execute(List<J> list){}
        /*try{
            for(J l : list){

            }
        // }catch(T e){}  Error can not catch instance type parameter
    }*/

    // we can not create array of parametered type:
    //Because type erase when compile time, generic type have no all information about type at run time
    // so we can not use operator instanceof
    public static <T> void rtti(List<T> list){
        // if(list instanceof ArrayList<Integer>){} error compile time.
    }
    public static void checkType(List<?> list){
        if(list instanceof ArrayList<?>){

        }
    }
    public static void main(String[] args){
        // We can't instance a type parameter with primitive type:
        // Pair3<int, char> pair3Primitive = new Pair3<>(3, 'b'); Error
        Pair3<Integer, Character> pair3 = new Pair3<>(new Integer(3), new Character('A'));
        // We can invoke append() method:
        List<String> stringList = new ArrayList<>();
        try {
            Pair3.append(stringList, String.class);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
        // List<Integer>[] integerList = new ArrayList<Integer>[10]; Error
    }
}
