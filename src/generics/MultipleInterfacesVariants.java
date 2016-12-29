package generics;

/**
 * Created by anonymous on 12/29/2016.
 */
interface Payable<T>{

}
class Employee3 implements Payable<Employee3>{}
// This won't compile....
// class Hourly extends Employee3 implements Payable<Hourly>{}
public class MultipleInterfacesVariants {
    public static void main(String[] args){

    }
}
