package dynamicProxy;

/**
 * Created by anonymous on 1/14/2017.
 */
public class Client1NoProxy {
    public static void main(String[] args){
        IVehicle car1 = new Car("Toyota");
        car1.start();
        car1.stop();
        car1.forward();
        car1.reverse();
        System.out.println(car1.getName());
    }
}
