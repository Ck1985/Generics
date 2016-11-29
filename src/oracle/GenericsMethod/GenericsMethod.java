package oracle.GenericsMethod;

/**
 * Created by Dell Vostro 5459 on 11/29/2016.
 */
import java.util.*;

//Note: When method has type parameter used only once. we should use wildcard (use: myCollection instead myCollecrion2)
interface myCollection<E>{
    public boolean containsAll(Collection<?> collection);
    public boolean addAll(Collection<? extends E> collection);
}

interface myCollection2<E>{
    public <T> boolean containsAll(Collection<T> collection);
    public <T extends E> boolean addAll(Collection<T> collection);
}
 //Note: generic method used to express dependencies among one or more type arguments
// with to return type of method. If not the generic method shouldn't used.

class MyCollections{
    public static <T> void copy(List<T> dest, List<? extends T> src){}
    // We can write signature this method by another way wothput wildcard
    public static <K, V extends K> void copy2(List<K> dest, List<V> src){}
    // Note: in method copy2 type parameter V used only once, (T used 2 time). So we can
    // replace V with wildcard. so that we can use method copy.
}
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
        Object[] objectArray = new Object[100];
        Collection<Object> objectCollection = new ArrayList<>();
        // T inferred to be Object
        copyFromArrayToCollectionVer2(objectArray, objectCollection);
        String[] stringArray = new String[100];
        Collection<String> stringCollection = new ArrayList<>();
        // T inferred to be String
        copyFromArrayToCollectionVer2(stringArray, stringCollection);
        copyFromArrayToCollectionVer2(stringArray, objectCollection);

        Integer[] integerArray = new Integer[100];
        Float[] floatArray = new Float[100];
        Number[] numberArray = new Number[100];
        Collection<Number> numberCollection = new ArrayList<>();
        // T inferred to be Number
        copyFromArrayToCollectionVer2(integerArray, numberCollection);
        // T inferred to be Number
        copyFromArrayToCollectionVer2(floatArray, numberCollection);
        // T inferred to be Number
        copyFromArrayToCollectionVer2(numberArray, numberCollection);
        // T inferred to be Object
        copyFromArrayToCollectionVer2(numberArray, objectCollection);
        // compile time error
        // copyFromArrayToCollectionVer2(numberArray, stringCollection);
    }
}
