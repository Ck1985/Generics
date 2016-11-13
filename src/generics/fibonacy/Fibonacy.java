package generics.fibonacy;
import generics.myCoffee.*;

/**
 * Created by anonymous on 11/13/2016.
 */
public class Fibonacy implements Generator<Integer>{
    private int count = 0;
    private int fibonacy(int count){
        if(count < 2){
            return 1;
        }else {
            return fibonacy(count - 2) + fibonacy(count - 1);
        }
    }
    public Integer next(){
        return fibonacy(count++);
    }
    public static void main(String[] args){
        Fibonacy fibonacy = new Fibonacy();
        for(int i = 0; i < 10; i++){
            System.out.print(fibonacy.next() + " ");
        }
        System.out.println();
    }
}
