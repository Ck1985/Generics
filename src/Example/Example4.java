package Example;

/**
 * Created by anonymous on 11/10/2016.
 */
import innerclassess.*;

public class Example4 {
    public static void main(String[] args){
        Sequence<Integer> sequence = new Sequence<>();
        for(int i = 1; i < 10; i++){
            sequence.add(i);
        }
        Selector<Integer> selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.chooseCurrent() + " ");
            selector.next();
        }
    }
}
