package generics;

/**
 * Created by anonymous on 12/17/2016.
 */
import java.util.*;

public class UnboundedWildcards2 {
    private static Map map1;
    private static Map<?, ?> map2;
    private static Map<String, ?> map3;
    static void assign1(Map map){
        map1 = map;
    }
    static void assign2(Map<?, ?> map){
        map2 = map;
    }
    static void assign3(Map<String, ?> map){
        map3 = map;
    }
    public static void main(String[] args){
        assign1(new HashMap());
        assign2(new HashMap());
        assign3(new HashMap()); // unchecked Warning

        assign1(new HashMap<String, Integer>());
        assign2(new HashMap<String, Integer>());
        assign3(new HashMap<String, Integer>());
    }
}
