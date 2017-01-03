package Example;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
abstract class SelfBoundedGeneric<T extends SelfBoundedGeneric<T>>{
    abstract T get(T arg);
    T callGetMethod(T arg){
        System.out.println("get(T arg)");
        return get(arg);
    }
}
class Derived extends SelfBoundedGeneric<Derived>{
    public Derived get(Derived derived){
        System.out.println("get(Derived derived)");
        return this;
    }
}
public class Example_34 {
    public static void main(String[] args){
        Derived derived = new Derived();
        derived.get(derived).callGetMethod(derived);
    }
}
