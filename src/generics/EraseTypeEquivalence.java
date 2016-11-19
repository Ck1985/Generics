package generics;

/**
 * Created by Dell Vostro 5459 on 11/19/2016.
 */
import java.util.*;

public class EraseTypeEquivalence {
    public static void main(String[] args){
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
}
