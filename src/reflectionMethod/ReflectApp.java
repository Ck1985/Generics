package reflectionMethod;

/**
 * Created by anonymous on 1/14/2017.
 */
import java.lang.reflect.*;

public class ReflectApp {
    public static void main(String[] args){
        Class[] noParams = new Class[]{};
        Class[] stringParams = new Class[1];
        stringParams[0] = String.class;
        Class[] intParams = new Class[1];
        intParams[0] = Integer.TYPE;
        try {
            Class cls = Class.forName("reflectionMethod.AppTest");
            Object object = cls.newInstance();
            Method method = cls.getDeclaredMethod("printIT");
            method.invoke(object, null);
            method = cls.getDeclaredMethod("printItString", stringParams);
            method.invoke(object, "anonymous");
            method = cls.getDeclaredMethod("printItInt", intParams);
            method.invoke(object, 100);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(IllegalAccessException e){
            System.out.println(e);
        }catch(InstantiationException e){
            System.out.println(e);
        }catch(NoSuchMethodException e){
            System.out.println(e);
        }catch(InvocationTargetException e){
            System.out.println(e);
        }
    }
}
