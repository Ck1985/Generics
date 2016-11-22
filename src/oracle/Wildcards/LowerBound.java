package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class LowerBound {
    public static void addList(List<? super Integer> list){
        for(int i = 1; i < 10; i++){
            list.add(i);
        }
    }
    public static void main(String[] args){
        addList(new ArrayList<>());
        addList(new ArrayList<Number>());
        addList(new ArrayList<Object>());
    }
}
