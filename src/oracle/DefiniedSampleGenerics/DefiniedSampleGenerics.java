package oracle.DefiniedSampleGenerics;

/**
 * Created by Dell Vostro 5459 on 11/27/2016.
 */
import java.util.Iterator;
interface List<E>{
    void add(E e);
    Iterator<E> iterator();
}
interface Iterator1<E>{
    E next();
    boolean hasNext();
}
interface IntegerList{
    void add(Integer integer);
    Iterator<Integer> iterator();
}
public class DefiniedSampleGenerics {
}
