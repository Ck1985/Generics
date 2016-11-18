package generics;

/**
 * Created by Dell Vostro 5459 on 11/18/2016.
 */
import java.util.*;
import generics.myCoffee.*;
import generics.watercolors.*;

class Customer{
    private static long count = 0;
    private final long id = count++;
    private Customer(){}
    public static Generator<Customer> generator(){
        return new Generator<Customer>(){
            public Customer next(){
                return new Customer();
            }
        };
    }
    public String toString(){
        return "Customer: " + this.id;
    }
}
class Teller{
    private static long count = 0;
    private final long id = count++;
    private Teller(){}
    public static Generator<Teller> generator(){
        return new Generator<Teller>(){
            public Teller next(){
                return new Teller();
            }
        };
    }
    public String toString(){
        return "Teller: " + this.id;
    }
}
public class BankTeller {
    public static void serve(Customer customer, Teller teller){
        System.out.println(customer + " serve: " + teller);
    }
    public static void main(String[] args){
        Random random = new Random(47);
        Queue<Customer> queue = new LinkedList<Customer>();
        Generators.fill(queue, Customer.generator(), 10);
        List<Teller> list = new ArrayList<Teller>();
        Generators.fill(list, Teller.generator(), 5);
        for(Customer customer : queue){
            serve(customer, list.get(random.nextInt(list.size())));
        }
    }
}
