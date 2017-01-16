package Example;

/**
 * Created by anonymous on 1/15/2017.
 */
import java.util.*;
import java.lang.reflect.*;
import net.mindview.util.Tuple;
import net.mindview.util.TwoTuple;
import generics.*;

class MixinHandler implements InvocationHandler{
    private Map<String, Object> map = null;
    public MixinHandler(TwoTuple<Object, Class<?>>...pairs){
        map = new HashMap<>();
        for(TwoTuple<Object, Class<?>> pair : pairs){
            for(Method method : pair.second.getMethods()){
                if(!map.containsKey(method.getName())){
                    map.put(method.getName(), pair.first);
                }
            }
        }
    }
    @SuppressWarnings("unchecked")
    public static Object newInstance(TwoTuple...pairs){
        Class[] interfaces = new Class[pairs.length];
        for(int i = 0; i < pairs.length; i++){
            interfaces[i] = (Class)pairs[i].second;
        }
        ClassLoader cl = pairs[0].getClass().getClassLoader();
        return Proxy.newProxyInstance(cl, interfaces, new MixinHandler(pairs));
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        String methodName = method.getName();
        Object objectContainsMethod = map.get(methodName);
        return method.invoke(objectContainsMethod, args);
    }
}
public class Example_39 {
    public static void main(String[] args){
        Object mixinProxy = MixinHandler.newInstance(
                Tuple.tuple(new BasicIMP(), Basic.class),
                Tuple.tuple(new TimeStampIMP(), TimeStamped.class),
                Tuple.tuple(new SerialNumberIMP(), SerialNumbered.class),
                Tuple.tuple(new Color3(), Colored3.class)
        );
        Basic b = (Basic)mixinProxy;
        b.set("anonymous");
        System.out.println(b.get());
        TimeStamped t = (TimeStamped)mixinProxy;
        System.out.println(t.getStamp());
        SerialNumbered s = (SerialNumbered)mixinProxy;
        System.out.println(s.getSerialNumber());
        Colored3 c = (Colored3)mixinProxy;
        System.out.println(c.getColor());
    }
}
