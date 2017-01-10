package dynamicProxy;

/**
 * Created by Dell Vostro 5459 on 1/9/2017.
 */
import java.lang.reflect.*;

interface IPerson{
    String getName();
    void eat();
}
class Person implements IPerson{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        System.out.println("Person name ...");
        return this.name;
    }
    public void eat(){
        System.out.println("Person eat() ....");
    }
    public void think(){
        System.out.println("Person think() ....");
    }
}
interface IAnimal{
    void eat();
}
class Animal implements IAnimal{
    public void eat(){
        System.out.println("Animal eat() ....");
    }
}
public class JavaDynamicProxyApp {
    public static void main(String[] args){

    }
}
