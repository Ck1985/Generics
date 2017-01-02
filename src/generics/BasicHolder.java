package generics;

/**
 * Created by anonymous on 1/2/2017.
 */
public class BasicHolder<T> {
    private T element;
    void set(T arg){
        this.element = arg;
    }
    T get(){
        return this.element;
    }
    public void f(){
        System.out.println(element.getClass().getSimpleName());
    }
    public static void main(String[] args){

    }
}
