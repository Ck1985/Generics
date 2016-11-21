package oracle.inheritance;

/**
 * Created by anonymous on 11/21/2016.
 */
import java.util.*;
public interface PayLoadList<E, V> extends List<E>{
    void setPayLoad(int index, String value);
}
class SubType{
    public static void main(String[] args){
        PayLoadList<String, Integer> payload1;
        PayLoadList<String, Double> payload2;
        PayLoadList<String, Float> payload3;
    }
}
