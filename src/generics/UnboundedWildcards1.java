package generics;

/**
 * Created by anonymous on 12/16/2016.
 */
import java.util.*;

public class UnboundedWildcards1 {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;
    public static void assign1(List list){
        list1 = list;
        list2 = list;
        list3 = list; // Warning: Unchecked
    }
    public static void assign2(List<?> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    public static void assign3(List<? extends Object> list){
        list1 = list;
        list2 = list;
        list3 = list;
    }
    public static void main(String[] args){
        List list = new ArrayList();
        assign1(list);
        assign2(list);
        assign3(list);
        List<String> stringList = new ArrayList<String>();
        assign1(stringList);
        assign2(stringList);
        assign3(stringList);
        List<?> wildList = new ArrayList();
        wildList = new ArrayList<String>();
        assign1(wildList);
        assign2(wildList);
        assign3(wildList);
    }
}
