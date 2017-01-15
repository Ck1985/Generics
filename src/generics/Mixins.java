package generics;

/**
 * Created by anonymous on 1/4/2017.
 */
import java.util.*;

interface TimeStamped {
    long getStamp();
}
class TimeStampedIMP implements TimeStamped{
    private final long timeStamp;
    public TimeStampedIMP(){
        timeStamp = new Date().getTime();
    }
    public long getStamp(){
        return this.timeStamp;
    }
}
interface SerialNumbered{
    long getSerialNumber();
}
class SerialNumberIMP implements SerialNumbered{
    private static long counter = 1;
    private final long serialNumber = counter++;
    public long getSerialNumber(){
        return this.serialNumber;
    }
}
interface Colored3{
    String getColor();
}
class Color3 implements Colored3{
    private String nameColor = "red";
    public void setColor(String name){
        nameColor = name;
    }
    public String getColor(){
        return this.nameColor;
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
class Mixin extends BasicIMP implements TimeStamped, SerialNumbered, Colored3{
    private TimeStamped timeStamped = new TimeStampedIMP();
    private SerialNumbered serialNumbered = new SerialNumberIMP();
    private Colored3 colored3 = new Color3();
    public long getStamp(){
        return timeStamped.getStamp();
    }
    public long getSerialNumber(){
        return serialNumbered.getSerialNumber();
    }
    public String getColor(){
        return colored3.getColor();
    }
}
public class Mixins {
    public static void main(String[] args){
        Mixin mixin1 = new Mixin();
        Mixin mixin2 = new Mixin();
        mixin1.set("Test String 1");
        mixin2.set("Test String 2");
        System.out.println(mixin1.get() + " " + mixin1.getStamp() + " " + mixin1.getSerialNumber());
        System.out.println(mixin2.get() + " " + mixin2.getStamp() + " " + mixin2.getSerialNumber());
    }
}
