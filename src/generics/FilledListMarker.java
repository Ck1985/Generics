package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
import java.util.*;

public class FilledListMarker<T> {
    public List<T> create(T t, int size){
        List<T> result = new ArrayList<T>();
        for(int i = 0; i < size; i++){
            result.add(t);
        }
     return result;
    }
    public static void main(String[] args){
        FilledListMarker<String> listMarker = new FilledListMarker<>();
        List<String> result = listMarker.create(new String("Hello"), 9);
        System.out.println(result);
    }
}
