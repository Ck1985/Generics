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
    // Generator version,
    public static <T> void fill(AddAble<T> addAble, Generator<T> generator, int size){
        for(int i = 0; i < size; i++){
            addAble.add(generator.next());
        }
    }
}
class AddAbleCollectionAdapter<T> implements AddAble<T>{
    private Collection<T> collection;
    public AddAbleCollectionAdapter(Collection<T> collection){
        this.collection = collection;
    }
    public void add(T item){
        this.collection.add(item);
    }
}
class Adapter{
    public static <T> AddAble<T> collectionAdapter(Collection<T> collection){
        return new AddAbleCollectionAdapter<T>(collection);
    }
}
class SimpleQueueAdapter<T> extends SimpleQueue<T> implements AddAble<T>{
    public void add(T item){
        super.add(item);
    }
}
class Fill2Test{
    public static void main(String[] args){
        List<Coffee> carrier = new ArrayList<>();
        Fill2.fill(new AddAbleCollectionAdapter<Coffee>(carrier), Coffee.class, 3);
        Fill2.fill(Adapter.collectionAdapter(carrier), Latte.class, 3);
        for(Coffee coffee : carrier){
            System.out.print(coffee + " ");
        }
        System.out.println();
        SimpleQueueAdapter<Coffee> simpleQueueAdapter = new SimpleQueueAdapter<Coffee>();
        Fill2.fill(simpleQueueAdapter, Mocha.class, 3);
        Fill2.fill(simpleQueueAdapter, Latte.class, 2);
        for(Coffee coffee : simpleQueueAdapter){
            System.out.println(coffee);
        }
    }
}
