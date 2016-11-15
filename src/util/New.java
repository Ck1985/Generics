package util;

/**
 * Created by anonymous on 11/15/2016.
 */
import java.util.*;
import holding.*;
import typeinfo.pets.*;

public class New {
    public static <K, V> Map<K, V> map(){
        return new HashMap<K, V>();
    }
    public static <T> List<T> list(){
        return new ArrayList<T>();
    }
    public static <T> LinkedList<T> lList(){
        return new LinkedList<T>();
    }
    public static <T> Set<T> set(){
        return new HashSet<T>();
    }
    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }
    public static void f(Map<Person, List<? extends Pet>> petPeople){}
    public static void main(String[] args){
        Map<String, List<Integer>> map = New.map();
        List<Double> list = New.list();
        LinkedList<Float> iList = New.lList();
        Map<Person, List<? extends Pet>> petPerson = New.map();
        f(New.map());
    }
}
