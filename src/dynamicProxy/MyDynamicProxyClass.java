package dynamicProxy;

/**
 * Created by Dell Vostro 5459 on 1/11/2017.
 */
import java.lang.reflect.*;

class MyInvocationTargetException extends InvocationTargetException{}
interface MyProxyInterface{
    Object method();
}
public class MyDynamicProxyClass implements InvocationHandler{
    private Object object;
    public MyDynamicProxyClass(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        try{
            throw new MyInvocationTargetException();
        }catch(MyInvocationTargetException e){
            throw e.getTargetException();
        }catch(Exception e){
            throw e;
        }
        //return something .....
    }
    public static Object newInstance(Object object, Class[] interfaces){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), interfaces, new MyDynamicProxyClass(object));
    }
    public void f(){
        MyProxyInterface foo = (MyProxyInterface)newInstance(this.object.getClass().getClassLoader(), new Class[]{MyProxyInterface.class});
    }
    public static void main(String[] args){

    }
}
