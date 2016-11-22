package oracle.Wildcards;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

class NatureNumber{
    private int i;
    public NatureNumber(int i){
        this.i = i;
    }
}
class EvenNumber extends NatureNumber{
    public EvenNumber(int i){
        super(i);
    }
}
public class GuidlineUseWildcard {
    public static void main(String[] args){
        List<EvenNumber> evenNumberList = new ArrayList<>();
        List<? extends NatureNumber> list = evenNumberList;
        // list.add(new NatureNumber(35)); Error
    }
}
