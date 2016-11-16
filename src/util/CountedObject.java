package util;

/**
 * Created by anonymous on 11/16/2016.
 */
public class CountedObject {
    private static long count = 0;
    private final long id = count++;
    private long getId(){
        return this.id;
    }
    public String toString(){
        return "CountedObject " + getId();
    }
}
