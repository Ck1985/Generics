package interafces;

/**
 * Created by anonymous on 11/13/2016.
 */
interface Service{
    void method1();
    void method2();
}
interface ServiceFactory{
    Service getService();
}
class Implementation1 implements Service{
    Implementation1(){}
    public void method1(){
        System.out.println("Implementation1 method1");
    }
    public void method2(){
        System.out.println("Implementation1 method2");
    }
}
class Implementation2 implements Service{
    Implementation2(){}
    public void method1(){
        System.out.println("Implementation2 method1");
    }
    public void method2(){
        System.out.println("Implementation2 method2");
    }
}
class ImplementsFactory1 implements ServiceFactory{
    public Service getService(){
        return new Implementation1();
    }
}
class ImplementsFactory2 implements ServiceFactory{
    public Service getService(){
        return new Implementation2();
    }
}
public class FactoryMethodDesign {
    public void serviceConsumer(ServiceFactory fact){
        Service service = fact.getService();
        service.method1();
        service.method2();
    }
    public static void main(String[] args){
        FactoryMethodDesign fmd = new FactoryMethodDesign();
        fmd.serviceConsumer(new ImplementsFactory1());
        fmd.serviceConsumer(new ImplementsFactory2());
    }
}
