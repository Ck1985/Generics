package oracle;

/**
 * Created by Dell Vostro 5459 on 11/20/2016.
 */
public class GenericsBox<T> {
    private T t;
    public void setT(T t){
        this.t = t;
    }
    public T getT(){
        return this.t;
    }
    public static void main(String[] args){
        GenericsBox<Integer> integerBox; //Like another variable decleration, this code is not create a new Box object;
                                         //It simply declare a variable to hold a reference point to Box<Integegr> object
        GenericsBox<String> stringBox = new GenericsBox<String>();
        GenericsBox<Integer> integerBox2 = new GenericsBox<>();
    }
}
