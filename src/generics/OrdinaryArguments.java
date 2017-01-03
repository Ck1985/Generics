package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
class OrdinarySetter{
    void set(Base base){
        System.out.println("Ordinary.set(Base)");
    }
}
class DerivedSetter extends OrdinarySetter{
    void set(Derived derived){
        System.out.println("DerivedSetter.set(derived)");
    }
}
public class OrdinaryArguments {
    public static void main(String[] args){
        Base base = new Base();
        Derived derived = new Derived();
        DerivedSetter derivedSetter = new DerivedSetter();
        derivedSetter.set(derived);
        derivedSetter.set(base); //Compile, overload not overridden
    }
}
