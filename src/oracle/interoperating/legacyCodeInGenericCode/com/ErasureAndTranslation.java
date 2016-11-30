package oracle.interoperating.legacyCodeInGenericCode.com;

/**
 * Created by anonymous on 11/30/2016.
 */
import java.util.*;

public class ErasureAndTranslation {
    public String loophole(Integer x){
        List<String> ys = new LinkedList<>();
        List xs = ys;
        xs.add(x); // Compile unchecked warning
        return ys.iterator().next();
    }
    // At run time code above behaves like:
    public String loopholeRunTime(Integer x){
        List ys = new LinkedList();
        List xs = ys;
        xs.add(x);
        return (String)ys.iterator().next(); // Error runtime !!!
    }
    public static void main(String[] args){

    }
}
