package generics;

/**
 * Created by anonymous on 11/10/2016.
 */
public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F sixth;
    public SixTuple(A first, B second, C third, D fourth, E fifth, F sixth){
        super(first, second, third, fourth, fifth);
        this.sixth = sixth;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth;
    }
}
