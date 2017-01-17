package generics;

/**
 * Created by Dell Vostro 5459 on 1/17/2017.
 */
import java.lang.reflect.*;

class Mime{
    public void walkAgaintsTheWind(){}
    public void sit(){
        System.out.println("Pretending to sit");
    }
    public void pushInvisibleWalls(){}
    public String toString(){
        return "Mime";
    }
}
class SmartDog{
    public void speak(){
        System.out.println("Woof Woof");
    }
    public void sit(){
        System.out.println("Sitting");
    }
    public void reproduce(){}
}
class CommunicateReflectively{
    public static void performs(Object speaker){
        Class<?> speakerClass = speaker.getClass();
        try{
            try{
                Method speak = speakerClass.getMethod("speak");
                speak.invoke(speaker);
            }catch(NoSuchMethodException e){
                System.out.println(speaker + " can not speak");
            }
            try{
                Method sit = speakerClass.getMethod("sit");
                sit.invoke(speaker);
            }catch(NoSuchMethodException e){
                System.out.println(speaker + " can not sit");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class LatentReflection {
    public static void main(String[] args){
        CommunicateReflectively.performs(new Mime());
        CommunicateReflectively.performs(new SmartDog());
        CommunicateReflectively.performs(new Robot());
    }
}
