package generics;

/**
 * Created by anonymous on 11/9/2016.
 */
public class Holder2 {
    private Object a;
    public Holder2(Object a){
        this.a = a;
    }
    public Object getA(){
        return this.a;
    }
    public void setA(Object a){
        this.a = a;
    }
    public static void main(String[] args){
        Holder2 h2 = new Holder2(new Automobile());
        Automobile automobile = (Automobile)h2.getA();
        h2.setA("Now it is not an Automobile type");
        String s = (String)h2.getA();
        h2.setA(1); // Autoboxing to Integer
        Integer integer = (Integer)h2.getA();
    }
}
