package oracle.Inference;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class TargetType<T> {
    public static void processStringList(List<String> stringList){
        //Processing list string.......
    }
    public static void main(String[] args){
        List<String> listEmpty = Collections.emptyList();
        List<String> listEmpty2 = Collections.<String>emptyList();
        processStringList(Collections.emptyList());
        processStringList(Collections.<String>emptyList());
    }
}
