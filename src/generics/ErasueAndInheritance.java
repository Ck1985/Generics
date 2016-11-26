package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
class BaseClass<T>{
    private T element;
    public void set(T element){
        this.element = element;
    }
    public T get(){
        return this.element;
    }
}
class Derived1<T> extends BaseClass<T>{}
class Derived2 extends BaseClass{}
// class Derived3 extends BaseClass<?>{}
public class ErasueAndInheritance {
    public static void main(String[] args){
        Derived2 derived2 = new Derived2();
        @SuppressWarnings("unchecled")
        Object object = new Object();
        derived2.set(object); //Warning appear here unchecked...
    }
}
