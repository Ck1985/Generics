package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;
class Foo{}
public class UpperBounded {
    public static void process(List<? extends Foo> listFoo){
        for(Foo foo : listFoo){
            // Access ecery elemnt of Foo list
        }
    }
    public static double sumOfList(List<? extends Number> numberList){
        double sum = 0;
        for(Number number : numberList){
            sum += number.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args){
        /*Integer integerNumber = new Integer(10);
        Double doubleNumber = new Double(20.5);
        Float floatNumber = new Float(95.3F);
        Long longNumber = new Long(50);*/

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(UpperBounded.sumOfList(list));
    }
}
