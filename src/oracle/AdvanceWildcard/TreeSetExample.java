package oracle.AdvanceWildcard;

/**
 * Created by anonymous on 12/2/2016.
 */
import java.util.*;

/*interface Comparator<T> {
    int compare(T first, T second);
}
class TreeSet<E>{
    public TreeSet(Comparator<E> comparator){

    }
}*/
// class Foo implements Comparable<Object>{}
public class TreeSetExample {
    // public static <T extends Comparable<T>> T max(Collection<T> collection){}
    // public static <T extends Comparable<? super T>> T max(Collection<T> collection){}
    public static void main(String[] args){
        Comparator<String> stringComparator = null;
        Comparator<Object> objectComparator = null;
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>(stringComparator);
        TreeSet<String> treeSet1 = new TreeSet<>(objectComparator);
        Comparator<? super String> comparator = null;
        TreeSet<?> treeSet2 = new TreeSet<>(comparator);
        /*
        Collection<Foo> cf = ....
        Collection.max(cf); should work.
         */
    }
}
