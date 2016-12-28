package generics;

/**
 * Created by Dell Vostro 5459 on 12/28/2016.
 */
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

class FArray{
    public static <T> T[] fill(T[] array, Generator<T> generator){
        for(int i = 0; i < array.length; i++){
            array[i] = generator.next();
        }
        return array;
    }
}
public class PrimitiveGenericsTest {
    public static void main(String[] args){
        String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
        for(String s : strings){
            System.out.println(s);
        }
        Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer());
        for(Integer i : integers){
            System.out.println(i);
        }
        //AutoBoxing will not working here
        // int[] ranInteger = FArray.fill(new Integer[10], new RandIntGenerator());
    }
}
