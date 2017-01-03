package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
public class SelfBoundedMethod {
    public static <T extends SelfBounded<T>> T f(T arg){
        return arg.set(arg).get();
    }
    public static void main(String[] args){
        A a = f(new A());
    }
}
