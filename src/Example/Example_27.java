package Example;

/**
 * Created by anonymous on 12/14/2016.
 */
import java.util.*;

public class Example_27 {
    public static void main(String[] args){
        //! List<Number> numberList = new ArrayList<Integer>();
        List<? extends Number> numberList = new ArrayList<Integer>();
        //! numberList.add(new Integer(10));
        numberList.add(null);
        numberList.get(0);
        System.out.println(numberList);
    }
}
