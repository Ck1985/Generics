package Example;

/**
 * Created by anonymous on 11/10/2016.
 */
import innerclassess.*;
import typeinfo.pets.*;

public class Example4 {
    public static void main(String[] args){
        LiteralPetCreator creator = new LiteralPetCreator();
        Pet[] pets = creator.createArray(10);
        Sequence<Pet> sequence = new Sequence<Pet>();
        for(int i = 0; i < pets.length; i++){
            sequence.add(pets[i]);
        }
        Selector<Pet> selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.chooseCurrent() + " ");
            selector.next();
        }
    }
}
