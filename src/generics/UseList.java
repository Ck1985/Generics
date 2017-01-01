package generics;

/**
 * Created by Dell Vostro 5459 on 1/1/2017.
 */
import java.util.*;
//This won't compile because of erasure....
public class UseList<T, K> {
    // public void f(List<T> listt){}
    // public void f(List<K> listk){}
     // Fix...
    public void f1(List<T> list){}
    public void f2(List<K> list){}
}
