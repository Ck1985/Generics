package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

public class UnboundedWildcards {
    public static void printListVer1(List<Object> listObject){
        for(Object object : listObject){
            System.out.print(object + " ");
        }
        System.out.println();
    }
    public static void printListVer2(List<?> list){
        for(Object object : list){
            System.out.print(object + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        // printListVer1(integerList); Error compile
        printListVer2(integerList);
        printListVer2(doubleList);
    }
}
