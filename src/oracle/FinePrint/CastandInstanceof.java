package oracle.FinePrint;

/**
 * Created by anonymous on 12/1/2016.
 */
import java.util.*;

public class CastandInstanceof {
    public <T> T badCast(T t, Object object){
        return (T)object; // warning unchecked at run time !
    }
    public static void main(String[] args){
        Collection collection = new ArrayList<String>();
        // if(collection instanceof Collection<String>){} Illegal
        // Collection<String> stringCollection = (Collection<String>)collection; Warning unchecked cast !!!
    }
}
