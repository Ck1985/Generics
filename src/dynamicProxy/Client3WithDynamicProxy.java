package dynamicProxy;

/**
 * Created by anonymous on 1/14/2017.
 */
import java.lang.reflect.*;

class VehicleProxyHandler implements InvocationHandler{
    private IVehicle vehicle;
    public VehicleProxyHandler(IVehicle vehicle){
        this.vehicle = vehicle;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
           System.out.println("VehicleProxyHandler is invoking: " + method.getName());
           return method.invoke(vehicle, args);
    }
}
public class Client3WithDynamicProxy {
    public static void main(String[] args){
        IVehicle car = new Car("BMW360");
        IVehicle vehicleProxy = (IVehicle)Proxy.newProxyInstance(IVehicle.class.getClassLoader(), new Class[]{IVehicle.class}, new VehicleProxyHandler(car));
        vehicleProxy.start();
        vehicleProxy.stop();
        vehicleProxy.forward();
        vehicleProxy.reverse();
        System.out.println(vehicleProxy.getName());
    }
}
