package generics.movie;

/**
 * Created by anonymous on 11/14/2016.
 */
import java.lang.reflect.*;
public class MaryQueen extends GoodCharacter implements WomanCharacter {

    public void cry() {
        System.out.println("Mary is crying");
    }

    public void fight() {
        System.out.println("Mary is fighting");
    }

    public boolean married() {
        return false;
    }
    public String toString(){
        try {
            return "Name: " + this.getClass().getSimpleName() + " sex: " + this.getClass().getField("sex"). + " id: " + this.id;
        }catch(NoSuchFieldException e){
            throw new RuntimeException(e);
        }
    }
}
