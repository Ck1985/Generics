package holding;
import java.util.*;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/5/2016.
 */
public class MapOfList {
    private static Map<Person, List<? extends Pet>> petPerson = new HashMap<Person, List<? extends Pet>>();
    static{
        petPerson.put(new Person("Person1"), Arrays.asList(new Cymric("Cymric1"), new Mutt("Mutt1")));
        petPerson.put(new Person("Person2"), Arrays.asList(new Cat("Cat1"), new Cat("Cat2"), new Dog("Dog1")));
        petPerson.put(new Person("Person3"), Arrays.asList(new Pug("Pug1"), new Cat("Cat3"), new Cat("Cat4")));
        petPerson.put(new Person("Person4"), Arrays.asList(new Rat("Rat1"), new Rat("Rat2")));
        petPerson.put(new Person("Person5"), Arrays.asList(new Rat("Rat3")));
    }
    public static void main(String[] args){
        print("Person: " + petPerson.keySet());
        print("Pets: " + petPerson.values());
        for(Person person : petPerson.keySet()){
            print(person + " has pets: ");
            for(Pet pet : petPerson.get(person)){
                print("                     " + pet);
            }
        }
    }
}
