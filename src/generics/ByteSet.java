package generics;

/**
 * Created by Dell Vostro 5459 on 12/28/2016.
 */
import java.util.*;
//import org.apache.commons.collections.primitives.*;

public class ByteSet {
    public static void main(String[] args){
        Byte[] possibles = new Byte[]{1,2,3,4,5,6,7,8,9};
        Set<Byte> setByte = new HashSet<>(Arrays.asList(possibles));
        List<Integer> set2 = Arrays.asList(1,2,3,4,5);
        List<String> listString = Arrays.asList("cao", "xuan", "quy)");
    }
}
