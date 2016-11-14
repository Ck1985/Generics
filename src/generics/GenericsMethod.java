package generics;

/**
 * Created by Dell Vostro 5459 on 11/15/2016.
 */
public class GenericsMethod {
    public <T> void method(T x){
        System.out.println(x.getClass().getName());
    }
    public static void main(String[] args){
        GenericsMethod genericsMethod = new GenericsMethod();
        genericsMethod.method(" ");
        genericsMethod.method(1);
        genericsMethod.method(0.5);
        genericsMethod.method(7.4F);
        genericsMethod.method(genericsMethod);
    }
}
