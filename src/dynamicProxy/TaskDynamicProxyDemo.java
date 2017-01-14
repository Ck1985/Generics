package dynamicProxy;

/**
 * Created by Dell Vostro 5459 on 1/12/2017.
 */
import java.lang.reflect.*;

interface Task{
    void setData(String data);
    int getCalData(int x);
}
class TaskImpl implements Task{
    public void setData(String data){
        System.out.println(data + " is saving ...");
    }
    public int getCalData(int x){
        return x * 10;
    }
}
/*class MyInvocationHandler implements InvocationHandler{
    private Object object;
    public MyInvocationHandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args){
        Object result = null;
        try{

        }
    }
}*/
public class TaskDynamicProxyDemo {
    public static void main(String[] args){

    }
}
