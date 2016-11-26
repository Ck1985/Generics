package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
import java.util.*;

public class ListMarker<T> {
    public List<T> create(){
        return new ArrayList<T>();
    }
    public static void main(String[] args){
        ListMarker<String> stringListMarker = new ListMarker<>();
        List<String> stringList = stringListMarker.create();
    }
}
