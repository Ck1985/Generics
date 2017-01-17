package generics;

/**
 * Created by Dell Vostro 5459 on 1/17/2017.
 */
import typeinfo.pets.*;
import static net.mindview.util.Print.print;

interface Performs{
    void speak();
    void sit();
}
class PerformingDog extends Dog implements Performs{
    public void speak(){
        print("Woof Woof !");
    }
    public void sit(){
        print("Sitting");
    }
    public void reproduce(){

    }
}
class Robot implements Performs{
    public void speak(){
        print("Click !");
    }
    public void sit(){
        print("Clank");
    }
    public void oilChange(){

    }
}
class Communicate{
    public static <T extends Performs> void performs(T perfomer){
        perfomer.speak();
        perfomer.sit();
    }
}
public class DogsAndRobots {
    public static void main(String[] args){
        PerformingDog dog = new PerformingDog();
        Robot robot = new Robot();
        Communicate.performs(dog);
        Communicate.performs(robot);
    }
}
