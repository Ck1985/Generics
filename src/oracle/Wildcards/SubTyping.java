package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class SubTyping {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        // List<Object> objectList = integerList; Error: List<Integer> is not
        // Subtype of List<Object>
        List<? extends Integer> integerList2 = new ArrayList<>();
        List<? extends Object> objectList2 = integerList2; // OK
    }
}
