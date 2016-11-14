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
        try {
            return "Name: " + this.name.getClass().getSimpleName() + " sex: " + this.getClass().getField("sex").toString() + " kind: " + this.getClass().getField("kind").toString() + " id: " + this.id;
        }catch(NoSuchFieldException e){
            throw new RuntimeException(e);
        }
    }
}
