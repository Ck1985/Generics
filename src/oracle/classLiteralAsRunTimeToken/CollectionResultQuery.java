package oracle.classLiteralAsRunTimeToken;

/**
 * Created by anonymous on 12/1/2016.
 */
import java.util.*;

class EmpInfo{}
class EmpFactory implements Factory<EmpInfo>{
    public EmpInfo make(){
        return new EmpInfo();
    }
}
public class CollectionResultQuery {
    public static <T> Collection<T> select(Factory<T> factory, String statement){
        Collection<T> resultCollection = new ArrayList<>();
        /*Run sql query using jdbc*/
       // for(/*iterator over jdbc result*/){
            T item = factory.make();
        resultCollection.add(item);
       // }
        return resultCollection;
    }
    // select method uses Class literal
    // Without Generic
    public static Collection select2(Class objectClass, String sqlStatement){
        Collection resultQuery = new ArrayList();
        // Run sql query using jdbc
        //for(/*Iterator over jdbc result*/){
           try {
               Object item = objectClass.newInstance();
               resultQuery.add(item);
           }catch(Exception e){
               throw new RuntimeException(e);
           }

        //}
        return resultQuery;
    }
    public static <T> Collection<T> select3(Class<T> tClass, String sqlStatement){
        Collection<T> resultQuery = new ArrayList<>();
        //for(){
        try {
            T t = tClass.newInstance();
            resultQuery.add(t);
        }catch(Exception e){

        }
        //}
        return resultQuery;
    }
    public static void main(String[] args){
        Collection<EmpInfo> resultQuery = select(new Factory<EmpInfo>(){
            public EmpInfo make(){
                return new EmpInfo();
            }
        }, "query statement");
        Collection<EmpInfo> resultQuery2 = select(new EmpFactory(), "query statement");
        // Using Class literal:

    }
}
