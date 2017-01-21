package generic_Tutorial;

/**
 * Created by anonymous on 1/21/2017.
 */
import java.util.*;

public class GenericsAndSubTyping {
    public static void main(String[] args){
        List<String> ls = new ArrayList<String>();
        // List<Object> lo = ls; Error Compile time. This snipe code is not legal !
        List<Object> lo = null;
        lo.add(new Object());
        // So ie statement: List<Object> lo = ls is legal
        // then
        // String element0 = lo.get(0); is true
        // But we have just add new object which has type is Object, then we get it
        // it to be String type. !!! So it is unpossible....
    }
}
