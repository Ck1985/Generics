package oracle.inheritance;

/**
 * Created by anonymous on 11/21/2016.
 */
public class inheritance {
    public static void someMethod(Number number){}
    public static void main(String[] args){
        Integer numberInteger = new Integer(10);
        Object object = new Object();
        // numberInteger = object; Error
        object = numberInteger; //OK
        someMethod(new Integer(10)); // OK
        someMethod(new Double(57.83)); //OK
    }
}
