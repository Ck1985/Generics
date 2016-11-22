package oracle.Inference;

/**
 * Created by anonymous on 11/22/2016.
 */
import java.util.*;

class MyClass<T>{
    private T t;
    public <U> MyClass(U u){

    }
}
public class InstantiationGenericClass {
    public static void main(String[] args){
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        //Inference type:
        Map<String, List<String>> map1 = new HashMap<>();
        // This will warning unchecked conversion, because this
        // refer to raw type, but not generics type:
        Map<String, List<String>> map2= new HashMap();
        MyClass<String> myClass = new MyClass<String>(new Integer(10));
        MyClass<String> myClass1 = new MyClass<>(20);
    }
}
