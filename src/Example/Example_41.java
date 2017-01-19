package Example;

/**
 * Created by anonymous on 1/19/2017.
 */
import java.util.*;
import generics.pets.*;
import generics.*;
import net.mindview.util.Generator;

interface AddAble<T>{
    void add(T item);
}
class Fill{
    public static <T> void fill(AddAble<T> addAble, Class<? extends T> typeToken, int size){
        for(int i = 0; i < size; i++){
            try {
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
public class Example_41 {
    public static void main(String[] args){
        List<Pet> pets = new ArrayList<>();
        Fill.fill(new AddAbleCollectionAdapter<Pet>(pets), Dog.class, 3);
        Fill.fill(Adapter.collectionAdapter(pets), Cat.class, 2);
        for(Pet pet : pets){
            System.out.println(pet);
        }
        System.out.println();
        SimpleQueueAdapter<Pet> simpleQueueAdapter = new SimpleQueueAdapter<>();
        Fill.fill(simpleQueueAdapter, Rat.class, 4);
        Fill.fill(simpleQueueAdapter, Cymric.class, 3);
        for(Pet pet : simpleQueueAdapter){
            System.out.println(pet);
        }
    }
}
