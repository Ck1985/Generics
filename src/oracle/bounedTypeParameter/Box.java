package oracle.bounedTypeParameter;

/**
 * Created by anonymous on 11/21/2016.
 */
public class Box<T> {
    private T t = null;
    public T getT(){
        return t;
    }
    public void setT(T t){
        this.t = t;
    }
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }
    public static void main(String[] args){
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(50);
        Box<String> stringBox = new Box<>();
        integerBox.inspect(10);
        integerBox.inspect(new Integer(20));
        // This will not compiled:
        //stringBox.espect("anonymous");
        //integerBox.inspect("anonymous");
    }
}
