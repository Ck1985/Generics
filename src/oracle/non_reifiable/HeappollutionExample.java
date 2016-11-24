package oracle.non_reifiable;

/**
 * Created by anonymous on 11/24/2016.
 */
import java.util.*;

public class HeappollutionExample {
    public static void main(String[] args){
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();
        ArrayBuilder.addList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addList(stringListB, "Ten", "Eleven", "Twelve");

        List<List<String>> listOfStringList = new ArrayList<List<String>>();
        ArrayBuilder.addList(listOfStringList, stringListA, stringListB);
        ArrayBuilder.faultMethod(Arrays.asList("Hello"), Arrays.asList("World"));
    }
}
