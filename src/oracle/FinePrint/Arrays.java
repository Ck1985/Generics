package oracle.FinePrint;

/**
 * Created by anonymous on 12/1/2016.
 */
import java.util.*;

public class Arrays {
    /*public <T> T[] createGenericArray(){
        return new T[100];
    }*/
    public static void main(String[] args){
        //Not really allowed
        /*List<String>[] arrayStringList = new List<String>[10];
        Object object = arrayStringList;
        Object[] objectArray = (Object[])object;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(new Integer(10));
        objectArray[1] = integerList;
        // Run time error:
        String string = arrayStringList[1].get(0);*/

        //Generic Array is not allowed, but Wildcard array is still OK
        List<?>[] lists = new ArrayList<?>[10];
        Object object = lists;
        Object[] objectArray = (Object[])object;
        List<Integer> integerList = new ArrayList<>();
        integerList.add(new Integer(10));
        objectArray[1] = integerList;
        String string = (String)lists[1].get(0); // OK cast explecit

        // List<String>[] lists1 = new ArrayList<?>[10];
    }
}
