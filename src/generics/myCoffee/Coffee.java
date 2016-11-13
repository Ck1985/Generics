package generics.myCoffee;

/**
 * Created by anonymous on 11/13/2016.
 */
public class Coffee {
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return this.getClass().getSimpleName() + " " + this.id;
    }
}
