package generics;
import java.util.*;

/**
 * Created by Dell Vostro 5459 on 12/12/2016.
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<>();
    public void add(T item){
        array.add(item);
    }
    public T get(int index){
        return array.get(index);
    }
}
