package Example;

/**
 * Created by anonymous on 12/29/2016.
 */
interface Payable{
    float getPay();
}
class Employee implements Payable{
    private float weeklyPay;
    public float getPay(){
        return weeklyPay;
    }
}
class Hourly extends Employee{
    private String name;
    protected float hourly;
    public int workedHour;
    Hourly(String name, float hourly, int workedHour){
        this.name = name;
        this.hourly = hourly;
        this.workedHour = workedHour;
    }
    public float getPay(){
        System.out.println("Pay " + this.name + "$" + this.hourly*workedHour);
        return this.hourly * this.workedHour;
    }
}
public class Example_31 {
    public static void main(String[] args){
        Hourly hourly = new Hourly("anonymous", 35.9f, 8);
        hourly.getPay();
    }
}
