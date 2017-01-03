package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
interface SelfBoundedSetter<T extends SelfBoundedSetter<T>>{
    void set(T arg);
}
interface Setter extends SelfBoundedSetter<Setter>{}
public class SelfBoudingAndCovariantArguments {
    public void test(Setter setter1, Setter setter2, SelfBoundedSetter sbs){
        setter1.set(setter2);
        // setter1.set(sbs); error Compile....
    }
    public static void main(String[] args){

    }
}
