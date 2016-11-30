package oracle.interoperating.genericsCodeinLegalcyCode.com.Example.widgets;

/**
 * Created by anonymous on 11/30/2016.
 */
import java.util.*;

class AssemblyExtends implements Assembly{
    public Collection<Part> getParts(){
        return new ArrayList<>();
    }
}
public class Inventory {
    public static void addAssembly(String name, Collection<Part> collection){}
    public static Assembly getAssembly(String name){
        return new AssemblyExtends();
    }
}
