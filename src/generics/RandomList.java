package generics;

/**
 * Created by anonymous on 11/11/2016.
 */
import java.util.*;

public class RandomList<T>{
    private ArrayList<T> list = new ArrayList<T>();
    private Random random = new Random(47);
    //Integer indexRandom = random.nextInt(list.size());
    public ArrayList<T> getList(){
        return this.list;
    }
    public T getRandom(){
        return list.get(random.nextInt(list.size()));
    }
    public void add(T object){
        this.list.add(object);
    }
    public static void main(String[] args){
        RandomList<Integer> numberObject = new RandomList<Integer>();
        for(int i = 1; i < 10; i++){
            numberObject.add(i);
        }
        for(Integer number : numberObject.list){
            System.out.print(number + " ");
        }
        System.out.println();
        for(int i = 0; i < numberObject.list.size(); i++){
            System.out.print(numberObject.getRandom() + " ");
        }
    }
}
