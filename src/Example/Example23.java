package Example;

/**
 * Created by anonymous on 12/10/2016.
 */
interface FactoryI<T>{
    T create(Integer i);
}
class Foo2<T>{
    private T x;
    public void get(){
        System.out.println(x);
    }
    public <F extends FactoryI<T>> Foo2(F factory, Integer i){
        x = factory.create(i);
    }
}
class FactoryInteger implements FactoryI<Integer>{
    public Integer create(Integer i){
        return new Integer(i);
    }
}
class Widget{
    private Integer i;
    static class Factory implements FactoryI<Widget>{
        public Widget create(Integer i){
            Widget w = new Widget();
            w.i = i;
            return w;
        }
    }
    public String toString(){
        return "Widget " + i;
    }
}
public class Example23 {
    public static void main(String[] args){
        Foo2 foo2Integer = new Foo2<Integer>(new FactoryInteger(), new Integer(5));
        Foo2 foo2Widget = new Foo2<Widget>(new Widget.Factory(), new Integer(8));
        foo2Integer.get();
        foo2Widget.get();
    }
}
