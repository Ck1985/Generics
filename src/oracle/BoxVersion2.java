package oracle;

/**
 * Created by Dell Vostro 5459 on 11/20/2016.
 */
public class BoxVersion2<T> {
    private T t;
    public void set(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
    public static void main(String[] args){
        BoxVersion2<Integer> integerBoxVersion2 = null;
    }
}
