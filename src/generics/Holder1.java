package generics;

/**
 * Created by anonymous on 11/9/2016.
 */
class Automobile{}

public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile getA(){
        return this.a;
    }
}
