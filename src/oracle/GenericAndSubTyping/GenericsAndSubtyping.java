package oracle.GenericAndSubTyping;

/**
 * Created by anonymous on 11/27/2016.
 */
import java.util.*;

public class GenericsAndSubtyping {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        // List<Object> objectList = stringList; Error
        // above statement error because:
        // Assume:
        // objectList.add(new Object());
        // String s = stringList.get(0); // rude supprise !!!
    }
}
