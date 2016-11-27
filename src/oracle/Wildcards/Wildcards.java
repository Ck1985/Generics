package oracle.Wildcards;

/**
 * Created by anonymous on 11/27/2016.
 */
import java.util.*;

public class Wildcards {
    public static void printCollection(Collection collection){
        Iterator iteratorCollection = collection.iterator();
        for(int k = 0; k < collection.size(); k++){
            System.out.print(iteratorCollection.next());
        }
        System.out.println();
    }
    public static void naiveprintCollection(Collection<Object> collection){
        for(Object object : collection){
            System.out.print(object);
        }
        System.out.println();
    }
    public static void wildcardprintCollection(Collection<?> collection){
        for(Object object : collection){
            System.out.println(object);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Collection<?> collection = new ArrayList<String>();
        // collection.add(new Object()); Error
    }
}
