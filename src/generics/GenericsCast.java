package generics;

/**
 * Created by anonymous on 12/29/2016.
 */
class FixedSizeStack<T>{
    private int index = 0;
    private Object[] stack = null;
    public FixedSizeStack(int size){
        stack = new Object[size];
    }
    public void push(T item){
        stack[this.index++] = item;
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        return (T)stack[--this.index];
    }
}
public class GenericsCast {
    private static final int SIZE = 10;
    public static void main(String[] args){
        FixedSizeStack<String> stringStack = new FixedSizeStack<>(10);
        String[] words = "A B C D E F G H I J".split(" ");
        for(String word : words){
            stringStack.push(word);
        }
        for(int i = 0; i < SIZE; i++){
            System.out.print(stringStack.pop() + " ");
        }
    }
}
