package generics;

/**
 * Created by Dell Vostro 5459 on 12/28/2016.
 */
import java.util.*;

public class ListOfInt {
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            integerList.add(new Integer(i));
        }
        for(Integer i : integerList){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
