package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class WildcardsError {
    void foo(List<?> list){
        list.get(0);
        // list.set(0, list.get(0)); Error capture #
    }
    public static void main(String[] args){

    }
}
