package oracle.GenericsMethod;

/**
 * Created by Dell Vostro 5459 on 11/29/2016.
 */
import java.util.*;

public class GenericsMethod {
    public static void copyFromArrayToCollection(Object[] objects, Collection<?> collection){
        for(Object object : objects){
            // collection.add(object); Compile time error !!!!!
        }
    }
    public static <T> void copyFromArrayToCollectionVer2(T[] ts, Collection<T> collection){
        for(T t : ts){
            collection.add(t); //Correct !!!
        }
    }
    public static void main(String[] args){

    }
}
