package Example;

/**
 * Created by Dell Vostro 5459 on 1/5/2017.
 */
import java.awt.*;
import java.util.*;

interface TimeStamped{
    long getStamp();
}
class TimeStampIMP implements TimeStamped{
    private long timeStamp;
    public TimeStampIMP(){
        this.timeStamp = new Date().getTime();
    }
    public long getStamp(){
        return this.timeStamp;
    }
}
interface SerialNumbered{
    long getSerialNumber();
}
class SerialNumberIMP implements SerialNumbered{
    private static long counter;
    private final long serialNumber = counter++;
    public long getSerialNumber(){
        return this.serialNumber;
    }
}
interface Basic{
    void set(String value);
    String get();
}
class BasicIMP implements Basic{
    private String value;
    public void set(String value){
        this.value = value;
    }
    public String get(){
        return this.value;
    }
}
interface Colored{
    // void setColor(String color);
    String getColor();
}
class Color implements Colored{
    private String color = "green";
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
class Mixin extends BasicIMP implements TimeStamped, SerialNumbered, Colored{
    private TimeStamped timeStamped = new TimeStampIMP();
    private SerialNumbered serialNumbered = new SerialNumberIMP();
    private Colored color = new Color();
    public long getStamp(){
        return timeStamped.getStamp();
    }
    public long getSerialNumber(){
        return serialNumbered.getSerialNumber();
    }
    public String getColor(){
        return color.getColor();
    }
}
public class Example_37 {
    public static void main(String[] args){
        Mixin mixin1 = new Mixin();
        Mixin mixin2 = new Mixin();
        mixin1.set("Test String 1");
        mixin2.set("Test String 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber() + " " + mixin1.getColor());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber() + " " + mixin2.getColor());
    }
}
