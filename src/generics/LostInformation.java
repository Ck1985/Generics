package generics;

/**
 * Created by Dell Vostro 5459 on 11/19/2016.
 */
import java.util.*;

class Frob{}
class Fnorkle{}
class Quark{}
class Pacticle<POSITION, MOMENTIUM>{}
public class LostInformation {
    public static void main(String[] args){
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
    }
}
