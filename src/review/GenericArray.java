package review;

/**
 * Created by anonymous on 1/1/2017.
 */
public class GenericArray<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArray(int size){
        // array = new T[size]; Error
        array = (T[])new Object[size];
    }
    public void put(int index, T item){
        array[index] = item;
    }
    public T get(int index){
        return array[index];
    }
    public T[] rep(){
        return array;
    }
    public static void main(String[] args){
        GenericArray<Integer> genericArray = new GenericArray<>(10);
        // ClassCastException will be thrown.....
        Integer[] integerArray = genericArray.rep();
        Object[] objectArray = genericArray.rep();
    }
}
