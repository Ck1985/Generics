package oracle.Wildcards;

/**
 * Created by anonymous on 12/4/2016.
 */
import java.util.*;

class MyCollection{
    public static <T> Set<T> unmodifiableSet(Set<T> set){
        return set;
    }
}
public class WildcardCapture {
    public static <T> void addSet(Set<T> set, T t){
        set.add(t);
    }
    public static void main(String[] args){
        Set<?> unknownTypwSet = new HashSet<String>();
        // addSet(unknownTypwSet, "abcd"); Error
        Set<?> set = MyCollection.unmodifiableSet(unknownTypwSet); // Ok
    }
}
