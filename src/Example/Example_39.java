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
    public static Obj newInstance(TwoTuple...pairs){

    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        String methodName = method.getName();
        Object objectContainsMethod = map.get(methodName);
        return method.invoke(objectContainsMethod, args);
    }
}
public class Example_39 {
    public static void main(String[] args){
        Object mixinProxy = Proxy.newProxyInstance(
                Tuple.tuple(new BasicIMP(), Basic.class),
                Tuple.tuple(new TimeStampIMP(), TimeStamped.class),

        )
    }
}
