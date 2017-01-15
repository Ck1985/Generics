package generics;

/**
 * Created by anonymous on 1/14/2017.
 */
import java.lang.reflect.*;
import java.util.*;

import net.mindview.util.Tuple;
import net.mindview.util.TwoTuple;
import net.mindview.util.Tuple.*;

class MixinProxy implements InvocationHandler{
    private Map<String, Object> delegateByMethod = null;
    public MixinProxy(TwoTuple<Object, Class<?>>...pairs){
        delegateByMethod = new HashMap<>();
        for(TwoTuple<Object, Class<?>> pair : pairs){
            for(Method method : pair.second.getMethods()){
                if(!delegateByMethod.containsKey(method.getName())){
                    delegateByMethod.put(method.getName(), pair.first);
                }
            }
        }
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        String nameMethod = method.getName();
        Object delegate = delegateByMethod.get(nameMethod);
        return method.invoke(delegate, args);
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple... pairs){
        Class[] interfaces = new Class[pairs.length];
        for(int i = 0; i < pairs.length; i++){
            interfaces[i] = (Class)pairs[i].second;
        }
        ClassLoader cl = pairs[0].getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinProxy(pairs));
    }
}
public class DynamicProxyMixin {
    public static void main(String[] args){
        Object proxyMixin = MixinProxy.newInstance(
                                                    Tuple.tuple(new BasicIMP(), Basic.class),
                                                    Tuple.tuple(new TimeStampedIMP(), TimeStamped.class),
                                                    Tuple.tuple(new SerialNumberIMP(), SerialNumbered.class)
        );
        Basic basic = (Basic)proxyMixin;
        basic.set("anonymous");
        System.out.println(basic.get());
        TimeStamped timeStamped = (TimeStamped)proxyMixin;
        System.out.println(timeStamped.getStamp());
        SerialNumbered serialNumbered = (SerialNumbered)proxyMixin;
        System.out.println(serialNumbered.getSerialNumber());
    }
}
