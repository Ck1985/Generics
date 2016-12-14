package generics;

/**
 * Created by anonymous on 12/14/2016.
 */
import java.util.*;

public class CompilerIntelligence {
    public static void main(String[] args){
        List<? extends Fruit> fList = Arrays.asList(new Apple());
        //! fList.add(new Apple());
        fList.contains(new Apple());
        fList.indexOf(new Apple());
    }
}
