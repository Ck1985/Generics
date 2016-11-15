package generics;

/**
 * Created by anonymous on 11/15/2016.
 */
import java.util.*;

public class GenericsVarargsMethod {
    public static <T> List<T> makeList(T... args){
        List<T> list = new ArrayList<T>();
        for(T arg : args){
            list.add(arg);
        }
        return list;
    }
    public static void main(String[] args){
        List<String> list = GenericsVarargsMethod.makeList("A");
        System.out.println(list);
        list = GenericsVarargsMethod.makeList("B", "C");
        System.out.println(list);
        list = makeList("EFGHIJKLMNPQSW".split(""));
        System.out.println(list);
    }
}
