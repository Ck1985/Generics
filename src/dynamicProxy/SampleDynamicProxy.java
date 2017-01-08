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
}
public class SampleDynamicProxy {
    public static void main(String[] args){

    }
}
