package oracle.FinePrint;

/**
 * Created by Dell Vostro 5459 on 12/1/2016.
 */
import java.util.*;

public class GenericsClassSharedByAllItsInvocatons {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
        System.out.println(stringList.getClass() == integerList.getClass());
    }
}
