package generics;

/**
 * Created by anonymous on 12/12/2016.
 */
import java.lang.reflect.*;

public class GenericArrayWithTypeToken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int size){
        array = (T[])Array.newInstance(type, size);
    }
    public void put(int index, T item) throws NegativeArraySizeException{
        this.array[index] = item;
    }
    public T get(int index){
        return this.array[index];
    }
    public T[] rep(){
        return this.array;
    }
    public static void main(String[] args){
        GenericArrayWithTypeToken<Integer> genericArrayWithTypeToken = new GenericArrayWithTypeToken<>(Integer.class, 10);
        // Now this is ok
        Integer[] arrayInteger = genericArrayWithTypeToken.rep();
    }
}
