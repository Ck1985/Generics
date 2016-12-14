package generics;

/**
 * Created by anonymous on 12/14/2016.
 */
import java.util.*;

public class NonCovarianceGenerics {
    public static void main(String[] args){
        //Compile Error: InCompatible type
        //! List<Fruit> fruits = new ArrayList<Apple>();
    }
}
