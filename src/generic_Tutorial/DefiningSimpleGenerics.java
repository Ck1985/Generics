package generic_Tutorial;

/**
 * Created by anonymous on 1/21/2017.
 */
import java.util.*;

interface MyList<E>{
    void add(E item);
    Iterator<E> iterator();
}
interface MyIterator<E>{
    E next();
    boolean hasNext();
}
// List<E> when it parametered type to Integer
// It analogous to ...
/* interface List<Integer>{
   void add(Integer x);
   Iterator<Integer> iterator();
}
 */
public class DefiningSimpleGenerics {
    public static void main(String[] args){

    }
}
