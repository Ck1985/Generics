package generics.movie;

/**
 * Created by anonymous on 11/14/2016.
 */
public class LindaHutkinson extends BadCharacter implements WomanCharacter {

    public void cry(){
        System.out.println("Linda is crying");
    }
    public void fight(){
        System.out.println("Linda is fighting");
    }
    public boolean married(){
        return true;
    }
    public String toString(){
        return "Name: " + this.getClass().getSimpleName() + " sex: " + LindaHutkinson.sex + " kind: " + this.kind +  " id: " + this.id;
    }
}
