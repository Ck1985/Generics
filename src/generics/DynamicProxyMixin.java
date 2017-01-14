package generics;

/**
 * Created by anonymous on 1/14/2017.
 */
import java.lang.reflect.*;
import java.util.*;
import net.mindview.util.TwoTuple;

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
}
public class DynamicProxyMixin {
    public static void main(String[] args){

    }
}
