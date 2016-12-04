package oracle.ConvertLegalcyCodetouseGenerics;

/**
 * Created by anonymous on 12/4/2016.
 */
import java.util.*;
interface MyCollection{
    boolean containsAll(Collection collection);
    boolean addAll(Collection collection);
}
interface MyCollectionGeneric<T>{
    <T> boolean containsAll(Collection<T> collection);
    <T> boolean addAll(Collection<T> collection);
}
public class ConvertingLegalcyCode {
    public static <T extends Comparable<? extends T>> T max(Collection<T> collection){
        return collection
    }
    public static void main(String[] args){

    }
}
