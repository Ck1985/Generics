package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
public class GenericsHolder<T> {
    private T object;
    public void set(T object){
        this.object = object;
    }
    public T get(){
        return this.object;
    }
    public static void main(String[] args){
        GenericsHolder<String> genericsHolder = new GenericsHolder<>();
        genericsHolder.set("Item");
        String s = genericsHolder.get();
    }
}
