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
    /*public static <T extends Comparable<? super T>> T max(Collection<T> collection){
        return
    }*/
    // The erasure of above method:
    // public static Comparable max(Collection collection){}
    // above method is different than original signature method:
    // public static Object max(Collection collection){}
    // So we can change:
    // public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> collection){}
    public static void main(String[] args){

    }
}
