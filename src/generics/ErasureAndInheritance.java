package generics;

/**
 * Created by anonymous on 11/19/2016.
 */
class GenericBase<T>{
    private T element;
    public void set(T arg){
        this.element = arg;
    }
    public T get(){
        return this.element;
    }
}
class Derived_1<T> extends GenericBase<T>{

}
class Derived_2 extends GenericBase{

}
//class Derived_3 extends GenericBase<?>{

//}
public class ErasureAndInheritance {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Derived_2 d2 = new Derived_2();
        Object object = d2.get();
        d2.set(object);
    }
}
