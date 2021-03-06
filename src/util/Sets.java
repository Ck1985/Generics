package util;

/**
 * Created by anonymous on 11/17/2016.
 */
import  java.util.*;

public class Sets {
    public static <T> Set<T> union(Set<T> setA, Set<T> setB){
        Set<T> resultSet = new HashSet<T>(setA);
        resultSet.addAll(setB);
        return resultSet;
    }
    public static <T> Set<T> intersection(Set<T> setA, Set<T> setB){
        Set<T> resultSet = new HashSet<T>(setA);
        resultSet.retainAll(setB);
        return resultSet;
    }
    public static <T> Set<T> difference(Set<T> setA, Set<T> setB){
        Set<T> resultSet = new HashSet<T>(setA);
        resultSet.removeAll(setB);
        return resultSet;
    }
    public static <T> Set<T> complement(Set<T> setA, Set<T> setB){
        return difference(union(setA, setB), intersection(setA, setB));
    }
    /*
    ** Test clone() of EnumSet class
     */
    /*public static <T extends Enum<T>> EnumSet<T> clone(EnumSet<T> sourceSet){
        EnumSet<T> result = sourceSet.clone();
        return result;
    }*/
}
