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
class FactoryInteger implements FactoryI<Integer>{
    public Integer create(){
        return new Integer(0);
    }
}
class Widget {
    public static class Factory implements FactoryI<Widget>{
        public Widget create(){
            return new Widget();
        }
    }
}
public class FactoryConstraint {
    public static void main(String[] args){
        new Foo2<Integer>(new FactoryInteger());
        new Foo2<Widget>(new Widget.Factory());
    }
}
