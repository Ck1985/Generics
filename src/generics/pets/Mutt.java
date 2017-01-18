//: typeinfo/pets/Mutt.java
package generics.pets;

public class Mutt extends Dog {
  public Mutt(String name) { super(name); }
  public Mutt() { super(); }
  public void speak(){
    System.out.println("I am Mutt");
  }
} ///:~
