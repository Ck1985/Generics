package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
import java.lang.reflect.*;
import java.util.*;

public class ArrayMarker<T> {
    private Class<T> kind;
    public ArrayMarker(Class<T> kind){
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size){
        return (T[])Array.newInstance(this.kind, size);
    }
    public static void main(String[] args){
        ArrayMarker<String> arrayMarker = new ArrayMarker<>(String.class);
        String[] stringArray = arrayMarker.create(9);
        System.out.println(Arrays.toString(stringArray));
    }
}
