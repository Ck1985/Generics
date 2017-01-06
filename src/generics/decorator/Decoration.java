package generics.decorator;

/**
 * Created by Dell Vostro 5459 on 1/5/2017.
 */
import java.util.*;

class Basic{
    private String value;
    public void set(String value){
        this.value = value;
    }
    public String get(){
        return this.value;
    }
}
class Decorator extends Basic{
    protected Basic basic;
    public Decorator(Basic basic){
        this.basic = basic;
    }
    public void set(String value){
        this.basic.set(value);
    }
    public String get(){
        return this.basic.get();
    }
}
class TimeStamped extends Decorator{}
class SerialNumbered extends Decorator{}
public class Decoration {
    public static void main(String[] args){

    }
}
