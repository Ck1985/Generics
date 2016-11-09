package Example;

/**
 * Created by anonymous on 11/9/2016.
 */
import typeinfo.pets.*;
import java.util.*;

class Robot{
    private String name;
    public Robot(String name){
        this.name = name;
    }
    public String toString(){
        return this.name;
    }
}
class Holder4<T>{
    private T a, b, c;
    public Holder4(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T getA(){
        return this.a;
    }
    public T getB(){
        return this.b;
    }
    public T getC(){
        return this.c;
    }
    public void setA(T a){
        this.a = a;
    }
    public void setB(T b){
        this.b = b;
    }
    public void setC(T c){
        this.c = c;
    }
    public String toString(){
        return this.a + ", " + this.b + ", " + this.c;
    }
}

public class Example2 {
    public static void main(String[] args){
        Robot robot1 = new Robot("Robot_1");
        Robot robot2 = new Robot("Robot_2");
        Robot robot3 = new Robot("Robot_3");
        Holder4<Robot> holder4 = new Holder4<Robot>(robot1, robot2, robot3);
        System.out.println(holder4);
    }
}
