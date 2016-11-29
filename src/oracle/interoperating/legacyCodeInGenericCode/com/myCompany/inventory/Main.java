package oracle.interoperating.legacyCodeInGenericCode.com.myCompany.inventory;

/**
 * Created by anonymous on 11/29/2016.
 */
import oracle.interoperating.legacyCodeInGenericCode.com.Example.widgets.*;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Collection<Part> collection = new ArrayList<>();
        collection.add(new Blade());
        collection.add(new Guillotine());
        Inventory.addAssembly("thinkee", collection);
        Collection<Part> k = Inventory.getAssembly("thinkee").getParts();
    }
}
