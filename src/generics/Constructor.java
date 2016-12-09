package generics;

/**
 * Created by anonymous on 12/9/2016.
 */
import java.lang.reflect.*;

public class Constructor<T> {
    public Constructor(){}
    public Constructor(int a, int b){
        System.out.println("a + b = " + a + b);
    }
    public static void main(String[] args){
        try {
            Class<?> objectClass = Class.forName("generics.Constructor");
            Class<?>[] arrayArgument = new Class[2];
            arrayArgument[0] = Integer.TYPE;
            arrayArgument[1] = Integer.TYPE;
            java.lang.reflect.Constructor<?> constructor = objectClass.getConstructor(arrayArgument);
            Object[] objects = new Object[2];
            objects[0] = new Integer(37);
            objects[1] = new Integer(40);
            Object objectConstructor = constructor.newInstance(objects);
        }catch(Throwable e){
            System.err.println(e);
        }
    }
}
