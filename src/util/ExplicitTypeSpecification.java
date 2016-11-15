package util;

/**
 * Created by anonymous on 11/15/2016.
 */
import java.util.*;
import typeinfo.pets.*;

public class ExplicitTypeSpecification {
    public static void f(Map<Person, List<Pet>> petPerson){}
    public static void main(String[] args){
        f(New.<Person, List<Pet>>map());
    }
}
