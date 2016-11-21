package oracle.inheritance;

/**
 * Created by anonymous on 11/21/2016.
 */
public class Box<T extends Number> {
    private T t;
    public Box(T t){
        this.t = t;
    }
    public void add(T t){
        this.t = t;
    }
    public void BoxTest(Box<Number> numberBox){

    }
    public static void main(String[] args){
        Box<Number> box = new Box<>(10);
        box.add(new Integer(15));
        box.add(new Double(30.75));
        box.add(new Float(12.76F));
    }
}
