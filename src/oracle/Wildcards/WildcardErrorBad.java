package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class WildcardErrorBad {
    public void swapFirstList(List<? extends Number> list1, List<? extends Number> list2){
        Number temp = list1.get(0);
        //list1.set(0, list2.get(0));
        //list2.set(0, temp);
    }
    public static void main(String[] args){

    }
}
