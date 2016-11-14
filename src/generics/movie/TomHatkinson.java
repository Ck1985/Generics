package generics.movie;

/**
 * Created by anonymous on 11/14/2016.
 */
public class TomHatkinson extends BadCharacter implements ManCharacter {

    public void run(){
        System.out.println("TomHatkinson is running");
    }
    public void fight(){
        System.out.println("TomHatkinson is fighting");
    }
    public void dead(){
        System.out.println("Tom Hatkinson is dead");
    }
}
