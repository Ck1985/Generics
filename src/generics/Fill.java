package generics;

/**
 * Created by anonymous on 1/18/2017.
 */
import java.util.*;

public class Fill {
    public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size){
            for (int i = 0; i < size; i++) {
                try {
                    collection.add(classToken.newInstance());
                }catch(Exception e){
                    throw new RuntimeException(e);
                }
            }
    }
}
class Contract{
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return this.getClass().getName() + ": " + this.id;
    }
}
class TitleTransfer extends Contract{

}
class FillTest{
    public static void main(String[] args){
        List<Contract> contracts = new ArrayList<>();
        Fill.fill(contracts, Contract.class, 5);
        Fill.fill(contracts, TitleTransfer.class, 5);
        for(Contract contract : contracts){
            System.out.print(contract + " ");
        }
        System.out.println();
        SimpleQueue<Contract> contracts1 = new SimpleQueue<>();
        // Fill.fill(contracts1, Contract.class, 3);
        // Fill.fill(contracts1, TitleTransfer.class, 2);
    }
}
