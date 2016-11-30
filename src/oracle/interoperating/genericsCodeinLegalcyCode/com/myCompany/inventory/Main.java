package oracle.interoperating.genericsCodeinLegalcyCode.com.myCompany.inventory;

/**
 * Created by Dell Vostro 5459 on 12/1/2016.
 */
import oracle.interoperating.genericsCodeinLegalcyCode.com.Example.widgets.Inventory;

import java.util.*;

public class Main {
    public static void msin(String[] args){
        Collection collection = new ArrayList();
        collection.add(new Blade());
        collection.add(new Guillotine());
        Inventory.addAssembly("thingee", collection);
        Collection k = Inventory.getAssembly("thingee").getParts();
    }
}
