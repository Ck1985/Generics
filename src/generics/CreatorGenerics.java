package generics;

/**
 * Created by anonymous on 12/8/2016.
 */
class X{}
class Creator extends GenericsWithCreator<X>{
    X creator(){
        return new X();
    }
    void f(){
        System.out.println(element.getClass().getName());
    }
}
abstract class GenericsWithCreator<T>{
    final T element;
    public GenericsWithCreator(){
        this.element = creator();
    }
    abstract T creator();
}
public class CreatorGenerics {
    public static void main(String[] args){
        Creator creator = new Creator();
        creator.f();
    }
}
