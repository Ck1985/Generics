package generics.movie;

/**
 * Created by anonymous on 11/14/2016.
 */
public class JimmiCarragher extends GoodCharacter implements ManCharacter {

    public void run(){
        System.out.println("Jimmi Carrage is running");
    }
    public void fight(){
        System.out.println("Jimmi Carrage is fighting");
    }
    public void dead(){
        System.out.println("Jimmi Carrage is dead");
    }
    public String toString(){
        return "Name: " + this.getClass().getSimpleName() + " sex: " + JimmiCarragher.sex + " kind: " + this.kind +  " id: " + this.id;
    }
}
