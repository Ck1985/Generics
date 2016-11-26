package generics;

/**
 * Created by Dell Vostro 5459 on 11/26/2016.
 */
public class SimpleHolder {
    private Object object;
    public void set(Object object){
        this.object = object;
    }
    public Object get(){
        return this.object;
    }
    public static void main(String[] args){
        SimpleHolder simpleHolder = new SimpleHolder();
        simpleHolder.set("Hello");
        String s = (String)simpleHolder.get();
    }
}
