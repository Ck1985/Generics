package generics;

/**
 * Created by anonymous on 1/18/2017.
 */
import java.util.*;
import generics.coffee.*;
import net.mindview.util.Generator;

interface AddAble<T>{
    void add(T t);
}
public class Fill2 {
    // TypeToken version
    public static <T> void fill(AddAble<T> addAble, Class<? extends T> typeToken, int size){
        for(int i = 0; i < size; i++){
            try{
                addAble.add(typeToken.newInstance());
            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    public static <T> void fill(AddAble<T> addAble, Generator<T> generator, int size){
        for(int i = 0; i < size; i++){
            addAble.add(generator.next());
        }
    }
}
class Fill2Test{

}
