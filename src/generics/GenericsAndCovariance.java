package generics;
import java.util.*;

/**
 * Created by anonymous on 12/14/2016.
 */
public class GenericsAndCovariance {
    public static void main(String[] args){
        List<? extends Fruit> fList = new ArrayList<Apple>();
        //! fList.add(new Apple());
        //! fList.add(new Fruit());
        //! fList.add(new Orange());
        fList.add(null);
        Fruit fruit = fList.get(0);
    }
}
