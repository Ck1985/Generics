package generics;

/**
 * Created by anonymous on 11/10/2016.
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple {
    public final E fifth;
    public FiveTuple(A first, B second, C third, D fourth, E fifth){
        super(first, second, third, fourth);
        this.fifth = fifth;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", " + fourth + ", " + this.fifth;
    }
}
