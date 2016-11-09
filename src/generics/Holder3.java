package generics;

/**
 * Created by anonymous on 11/9/2016.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a = a;
    }
    public void setA(T a){
        this.a = a;
    }
    public T getA(){
        return this.a;
    }
    public static void main(String[] args){
        Holder3<Automobile> h3 = new Holder3<>(new Automobile());
        Automobile a = h3.getA();
        // h3.setA("Not an Automobile"); Error
        // h3.setA(1); Error
    }
}
