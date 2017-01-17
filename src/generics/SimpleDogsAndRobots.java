package generics;

/**
 * Created by Dell Vostro 5459 on 1/17/2017.
 */
class CommunicateSimple{
    public static void performs(Performs performs){
        performs.speak();
        performs.sit();
    }
}
public class SimpleDogsAndRobots {
    public static void main(String[] args){
        PerformingDog dog = new PerformingDog();
        Robot robot = new Robot();
        CommunicateSimple.performs(dog);
        CommunicateSimple.performs(robot);
    }
}
