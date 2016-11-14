package generics.movie;

/**
 * Created by anonymous on 11/14/2016.
 */
import java.lang.reflect.*;
public class JackSparrow extends GoodCharacter implements ManCharacter {
    public void run(){
        System.out.println("Jack Sparrow is running");
    }
    public void fight(){
        System.out.println("Jack Sparrow is fighting");
    }
    public void dead(){
        System.out.println("Jack Sparrow is dead");
    }
    public String toString(){
        try {
            return "Name: " + this.name.getClass().getSimpleName() + " sex: " + this.getClass().getField("sex").toString() + " kind: " + this.getClass().getField("kind").toString() + " id: " + this.id;
        }catch(NoSuchFieldException e){
            throw new RuntimeException(e);
        }
    }
}
