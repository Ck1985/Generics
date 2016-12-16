package Example;

/**
 * Created by anonymous on 12/16/2016.
 */
class Pet28{}
class Cat28 extends Pet28{}
class Dog28 extends Pet28{}
public class Example_28 {
    static class Generic1<T> {
        private T item;
        void take(T item) {
            this.item = item;
        }
    }
    static class Generic2<T> {
        private T item;
        T give(){
            return item;
        }
    }
    public <T> void f1(Generic1<? super T> generic1, T item){
        generic1.take(item);
    }
    public <T> T f2(Generic2<? extends T> generics2){
        return generics2.give();
    }
    public static void main(String[] args){
        Example_28 ex = new Example_28();
        ex.f1(new Generic1<Pet28>(), new Cat28());
        ex.f2(new Generic2<Cat28>());
    }
}

