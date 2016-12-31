package Example;

/**
 * Created by anonymous on 12/30/2016.
 */
class FixedSizeStack<T>{
    private int index = 0;
    private Object[] arrayBase = null;
    public FixedSizeStack(int size){
        arrayBase = new Object[size];
    }
    public int getIndex(){
        return this.index;
    }
    public void push(T item){
        this.arrayBase[this.index++] = item;
    }
    @SuppressWarnings("unchecked")
    public T pop(){
        return (T)this.arrayBase[--this.index];
    }
}
public class Example_32 {
    private static final int SIZE = 10;
    public static void main(String[] args){
        FixedSizeStack<Integer> integerStack = new FixedSizeStack<>(SIZE);
        // integerStack throws Exception Out Of Bound....Run time
        /*for(int i = 0; i < 11; i++){
            integerStack.push(i);
        }*/
        for(int i = 0; i < 12; i++){
            if(integerStack.getIndex() < SIZE){
                integerStack.push(i);
            }else{
                break;
            }
        }
        for(int i = 0; i < SIZE; i++){
            System.out.print(integerStack.pop() + " ");
        }
        System.out.println();
    }
}
