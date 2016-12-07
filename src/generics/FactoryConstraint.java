package generics;

/**
 * Created by anonymous on 12/7/2016.
 */
interface FactoryI<T>{
    T create();
}
class Foo2<T>{
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory){
        x = factory.create();
    }
}
public class FactoryConstraint {
    public static void main(String[] args){

    }
}
