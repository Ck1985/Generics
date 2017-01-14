package dynamicProxy;

/**
 * Created by anonymous on 1/14/2017.
 */
public class Car implements IVehicle{
    private String name;
    public Car(String name){
        this.name = name;
    }
    public void start(){
        System.out.println("Car " + this.name + " started");
    }
    public void stop(){
        System.out.println("Car "+ this.name + " stoped");
    }
    public void forward(){
        System.out.println("Car " + this.name + " is forwarding");
    }
    public void reverse(){
        System.out.println("Car " + this.name + " is reversing");
    }
    public String getName(){
        return this.name;
    }
}
