package generics;

/**
 * Created by anonymous on 11/19/2016.
 */
public class ReturnGenericsType<T extends HasF> {
    private T object;
    public ReturnGenericsType(T object){
        this.object = object;
    }
    public T getObject(){
        return this.object;
    }
}
