package Example;

/**
 * Created by anonymous on 11/9/2016.
 */
import typeinfo.pets.*;

class Holder<T>{
    private T a;
    public Holder(T a){
        this.a = a;
    }
    public T getA(){
        return this.a;
    }
    public void setA(T a){
        this.a = a;
    }
}

public class Example1 {
    public static void main(String[] args){
        Holder<Pet> holderPet = new Holder<Pet>(new Dog());
        Pet pet = holderPet.getA();
        Dog dog = (Dog)holderPet.getA();
        Holder<Pet> holderPet2 = new Holder<Pet>(new Rodent());
        Pet rat = holderPet2.getA();
        Rodent rodent = (Rodent)holderPet2.getA();
        Rat rat2 = (Rat)holderPet2.getA();

        Holder<Pet> holderPet3 = new Holder<Pet>(new Pet());
        Pet pet3 = holderPet3.getA();
        System.out.println(pet3);
        //also hold subtype of Pet
        holderPet3.setA(new Dog());

    }
}
