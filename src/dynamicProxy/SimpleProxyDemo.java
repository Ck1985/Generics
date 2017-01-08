/**
 * Created by Dell Vostro 5459 on 1/8/2017.
 */
package dynamicProxy;

interface Interface{
    void doSomething();
    void doSomethingElse(String arg);
}
class RealObject implements Interface{
    public void doSomething(){
        System.out.println("RealObject doSomething()");
    }
    public void doSomethingElse(String arg){
        System.out.println("RealObject doSomethingElse()" + arg);
    }
}
class SimpleProxy implements Interface{
    private Interface proxied;
    public SimpleProxy(Interface proxied){
        this.proxied = proxied;
    }
    public void doSomething(){
        System.out.println("SimpleProxy doSomething()");
        this.proxied.doSomething();
    }
    public void doSomethingElse(String arg){
        System.out.println("SimpleProxy doSomethingElse()" + arg);
        this.proxied.doSomethingElse(arg);
    }
}
public class SimpleProxyDemo {
    public static void consumer(Interface inter){
        inter.doSomething();
        inter.doSomethingElse("bonono");
    }
    public static void main(String[] args){
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
