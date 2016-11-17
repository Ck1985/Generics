package Example;

/**
 * Created by anonymous on 11/17/2016.
 */
import generics.watercolors.WaterColors;

import java.util.*;
import static generics.watercolors.WaterColors.*;

public class Example17 {
    static <T extends Enum<T>> Set<T> union(Set<T> setA, Set<T> setB){
        Set<T> result = null;
        try {
            if (setA instanceof EnumSet) {
                result = ((EnumSet<T>) setA).clone();
                result.addAll(setB);
                return result;
            } else {
                result = new HashSet<T>();
                result.addAll(setB);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    static <T extends Enum<T>> Set<T> intersection(Set<T> setA, Set<T> setB){
        Set<T> result = null;
        try {
            if (setA instanceof EnumSet) {
                result = ((EnumSet<T>) setA).clone();
                result.retainAll(setB);
                return result;
            } else {
                result = new HashSet<T>();
                result.retainAll(setB);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    static <T extends Enum<T>> Set<T> difference(Set<T> setA, Set<T> setB){
        Set<T> result = null;
        try{
            if(setA instanceof EnumSet){
                result = ((EnumSet<T>)setA).clone();
                result.removeAll(setB);
                return result;
            }else{
                result = new HashSet<T>();
                result.removeAll(setB);
                return result;
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    static <T extends Enum<T>> Set<T> compilement(Set<T> setA, Set<T> setB){
        Set<T> result = difference(union(setA, setB), intersection(setA, setB));
        return result;
    }
    public static void main(String[] args){
        Set<WaterColors> set1 = EnumSet.range(ZINC, PERMANENT_GREEN);
        Set<WaterColors> set2 = EnumSet.range(BRILLIANT_RED, CERULEAN_BLUE_HUE);
        System.out.println("union(set1, set2): " + union(set1, set2));
        System.out.println("intersection(set1, set2): " + intersection(set1, set2));
        System.out.println("difference(set1, set2): " + difference(set1, set2));
    }
}
