package oracle.classLiteralAsRunTimeToken;

/**
 * Created by anonymous on 12/1/2016.
 */
import java.util.*;


public class CollectionResultQuery {
    public <T> Collection<T> select(Factory<T> factory, String statement){
        Collection<T> resultCollection = new ArrayList<>();
        /*Run sql query using jdbc*/
       // for(/*iterator over jdbc result*/){
            T item = factory.make();
        resultCollection.add(item);
       // }
        return resultCollection;
    }
    public static void main(String[] args){

    }
}
