package Example;

/**
 * Created by anonymous on 1/19/2017.
 */
import java.util.*;
import generics.pets.*;
import net.mindview.util.Generator.*;

interface AddAble<T>{
    void add(T itam);
}
class Fill{
    public <T> void fill(AddAble<T> addAble, Class<? extends T> typeToken, int size){
        for(int i = 0; i < size; i++){
            try {
                addAble.add(typeToken.newInstance());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    public <T> void fill(AddAble<T> addAble, Generator<T>)
}
class AddAbleCollectionAdapter{

}
class Adapter{

}
public class Example_41 {
    public static void main(String[] args){

    }
}
