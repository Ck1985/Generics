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
        return "Name: " + this.getClass().getSimpleName() + " sex: " + JackSparrow.sex + " kind: " + this.kind +  " id: " + this.id;
    }
}
