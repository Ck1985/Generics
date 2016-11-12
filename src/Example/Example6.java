package Example;

/**
 * Created by Dell Vostro 5459 on 11/12/2016.
 */
import generics.*;
import typeinfo.pets.*;
import java.util.*;

public class Example6 {
    public static void main(String[] args){
        RandomList<String> randomList1 = new RandomList<>();
        String sourceString = "Anonymous 11100001 will be hacker King and Boss";
        for(String string : sourceString.split(" ")){
            randomList1.add(string);
        }
        for(int i = 0; i < randomList1.getList().size(); i++){
            System.out.print(randomList1.getRandom() + " ");
        }
        System.out.println();
        RandomList<Pet> listPet = new RandomList<Pet>();
        LiteralPetCreator creator = new LiteralPetCreator();
        Pet[] pets = creator.createArray(20);
        ArrayList<Pet> arrayListPet = listPet.getList();
        arrayListPet.addAll(Arrays.asList(pets));
        for(int i = 0; i < arrayListPet.size(); i++){
            System.out.print(arrayListPet.get(i) + " ");
        }
        System.out.println();
        for(int i = 0; i < arrayListPet.size(); i++){
            System.out.print(listPet.getList() + " ");
        }
    }
}
