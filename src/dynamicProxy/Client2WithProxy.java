package dynamicProxy;

/**
 * Created by anonymous on 1/14/2017.
 */
class VehicleProxy implements IVehicle{
    private IVehicle vehicle = null;
    public VehicleProxy(IVehicle vehicle){
        this.vehicle = vehicle;
    }
    public void start(){
        System.out.println("VehicleProxy: Beginning start()");
        this.vehicle.start();
        System.out.println("VehicleProxy: End of start()");
    }
    public void stop(){
        System.out.println("VehicleProxy: Beginning stop()");
        vehicle.stop();
        System.out.println("VehicleProxy: End of stop()");
    }
    public void forward(){
        System.out.println("VehicleProxy: Beginning forward()");
        this.vehicle.forward();
        System.out.println("VehicleProxy: End of forward()");
    }
    public void reverse(){
        System.out.println("VehicleProxy: Beginning reverse()");
        this.vehicle.reverse();
        System.out.println("VehicleProxy: End of reverse()");
    }
    public String getName(){
        return "VehicleProxy's name: " + this.vehicle.getName();
    }
}
public class Client2WithProxy {
    public static void main(String[] args){
        IVehicle car = new Car("Lexus");
        VehicleProxy vehicleProxy = new VehicleProxy(car);
        vehicleProxy.start();
        vehicleProxy.stop();
        vehicleProxy.forward();
        vehicleProxy.reverse();
        System.out.println(vehicleProxy.getName());
    }
}
