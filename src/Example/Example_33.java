package Example;

/**
 * Created by anonymous on 12/31/2016.
 */
import java.util.*;

class VariableSizeStack<T>{
    private List<T> listBase = null;
    public VariableSizeStack(){
        listBase = new ArrayList<T>();
    }
    public int count(){
        return listBase.size();
    }
    public void push(T item){
        listBase.add(item);
    }
    public T pop(){
        return listBase.remove(listBase.size() - 1);
    }
}
public class Example_33 {
    public static void main(String[] args){
        VariableSizeStack<String> stack = new VariableSizeStack<>();
        for(String string : "A B C D E F G H I J K".split(" ")){
            stack.push(string);
        }
        int initializeSize = stack.count();
        for(int i = 0; i < initializeSize; i++){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
