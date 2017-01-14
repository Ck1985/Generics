package dynamicProxy;

/**
 * Created by anonymous on 1/8/2017.
 */
import java.lang.reflect.*;

class DynamicProxyHandler implements InvocationHandler{
    private Object proxied;
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("*****proxy: " + proxy.getClass() + ", method: " + method.getName() + ", args: " + args);
        if(args != null){
            for(Object arg : args){
                System.out.print(arg + " ");
            }
        }
        return method.invoke(proxied, args);
    }
}
public class SimpleDynamicProxy {
    public static void consumer(Interface inter){
        inter.doSomething();
        inter.doSomethingElse("anonymous");
    }
    public static void main(String[] args){
        RealObject realObject = new RealObject();
        consumer(realObject);
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
                                                            new Class[]{Interface.class},
                                                            new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}
