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
class TimeStamped extends Decorator{
    private final long timeStamp;
    public TimeStamped(Basic basic){
        super(basic);
        timeStamp = new Date().getTime();
    }
    public long getTimeStamp(){
        return this.timeStamp;
    }
}
class SerialNumbered extends Decorator{
    private static long counter = 1;
    private final long serialNumber = counter++;
    public SerialNumbered(Basic basic){
        super(basic);
    }
    public long getSerialNumber(){
        return this.serialNumber;
    }
}
public class Decoration {
    public static void main(String[] args){
        TimeStamped t1 = new TimeStamped(new Basic());
        TimeStamped t2 = new TimeStamped(new SerialNumbered(new Basic()));
        t1.getTimeStamp();
        t2.getTimeStamp();
        // t2.getSerialNumber(); Error Not available
        SerialNumbered s1 = new SerialNumbered(new Basic());
        SerialNumbered s2 = new SerialNumbered(new TimeStamped(new Basic()));
        s1.getSerialNumber();
        s2.getSerialNumber();
        // s2.getTumeStamp(); Error Not available
    }
}
