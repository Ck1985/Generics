package generics;

/**
 * Created by Dell Vostro 5459 on 12/14/2016.
 */
import java.util.*;

public class SuperTypeWildcards {
    public void writeTo(List<? super Apple> appleList){
        appleList.add(new Apple());
        //! appleList.add(new Fruit());Error
        appleList.add(new Jonathan());
    }
    public static void main(String[] args){

    }
}
