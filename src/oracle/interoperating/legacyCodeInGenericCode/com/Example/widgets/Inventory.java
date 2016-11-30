package oracle.interoperating.legacyCodeInGenericCode.com.Example.widgets;

/**
 * Created by anonymous on 11/29/2016.
 */
import java.util.*;

class AssemblyExtends implements Assembly{
    public Collection getParts(){
        return new ArrayList();
    }
}
public class Inventory {
    public static void addAssembly(String name, Collection parts){}
    public static Assembly getAssembly(String name){
        return new AssemblyExtends();
    }
}
