package Example;

/**
 * Created by anonymous on 11/9/2016.
 */
import typeinfo.pets.*;
import java.util.*;

class Holder4<T>{
    private T a, b, c;
    public Holder4(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    private List<T> list = new ArrayList<T>(Arrays.asList(a, b, c));
    public T getelement(int index){
        return this.list.get(index);
    }
}

public class Example2 {
    public static void main(String[] args){
        //Holder4<Rodent> holder4 = new Holder<Rodent>(new Rodent(), new Rat(), new Mouse());
    }
}
