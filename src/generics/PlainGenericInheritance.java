package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
class GenericSetter<T>{
    void set(T arg){
        System.out.println("GenericSetter.set(Base)");
    }
}
class DerivedGS extends GenericSetter<Base>{
    void set(Derived derived){
        System.out.println("DerivedGS.set(Derived)");
    }
}
public class PlainGenericInheritance {
    public static void main(String[] args){
        Base base = new Base();
        Derived derived = new Derived();
        DerivedGS dds = new DerivedGS();
        dds.set(base); //Compile, overloaded, not overridden ....
        dds.set(derived);
    }
}
