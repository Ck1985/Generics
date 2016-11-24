package oracle;

/**
 * Created by anonymous on 11/24/2016.
 */
import java.util.*;

class Pair3<K, V>{
    private K key;
    private V value;
    public Pair3(K key, V value){
        this.key = key;
        this.value = value;
    }
    public static <E> void append(List<E> list){
        // We can instance type parameter directly
        // E e = new E(); Error
    }
    // As a workaround, we can create instance type parameter
    // by using newInstance() method
    public static <E> void append(List<E> list, Class<E> cls) throws Exception{
        E e = cls.newInstance(); // OK
    }
}
public class Restrictions{
    public static void main(String[] args){
        // We can't instance a type parameter with primitive type:
        // Pair3<int, char> pair3Primitive = new Pair3<>(3, 'b'); Error
        Pair3<Integer, Character> pair3 = new Pair3<>(new Integer(3), new Character('A'));
        // We can invoke append() method:
        List<String> stringList = new ArrayList<>();
        try {
            Pair3.append(stringList, String.class);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
