package oracle.introduction;

/**
 * Created by Dell Vostro 5459 on 11/27/2016.
 */
import java.util.*;

public class Introduction {
    public static void main(String[] args){
        List myList = new LinkedList();
        myList.add(new Integer(0));
        Integer object = (Integer)myList.iterator().next();

        List<Integer> myIntegerList = new ArrayList<>();
        myIntegerList.add(new Integer(0));
        Integer number = myIntegerList.get(0);
    }
}
