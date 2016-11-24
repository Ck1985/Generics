package oracle.non_reifiable;

/**
 * Created by anonymous on 11/24/2016.
 */
import java.util.*;

public class ArrayBuilder {
    @SuppressWarnings({"unchecked", "vararg"})
    public static <T> void addList(List<T> listArg, T ... elements){
        for(T element : elements){
            listArg.add(element);
        }
    }
    @SafeVarargs
    public static void faultMethod(List<String> ... lists){
        Object[] objectArray = lists;
        objectArray[0] = Arrays.asList(15);
        String s = lists[0].get(0);
    }
}
