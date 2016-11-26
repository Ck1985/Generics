package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
public class Erased<T> {
    private static final int SIZE = 100;
    public void f(Object arg){
         // if(arg instanceof T){} Error
        // T t = new T(); error
        // T[] arrayT = new T[SIZE];Error
         T[] array = (T[])new Object[SIZE]; // Warning check
    }
}
