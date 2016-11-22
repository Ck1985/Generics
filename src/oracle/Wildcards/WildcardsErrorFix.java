package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class WildcardsErrorFix {
    public static void foo(List<?> list){
        fooHelper(list);
    }
    private static <T> void fooHelper(List<T> list){
        list.set(0, list.get(0));
    }
    public static void main(String[] args){

    }
}
