package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
class Base{}
class Derived extends Base{}
interface OrdinaryGetter{
    Base get();
}
interface DerivedGetter extends OrdinaryGetter{
    //Return type of overridden is allowed to vary ...
    Derived get();
}
public class CovariantReturnTypes {
    public void test(DerivedGetter d){
        Derived d2 = d.get();
    }
    public static void main(String[] args){

    }
}
