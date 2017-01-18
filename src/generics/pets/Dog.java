//: typeinfo/pets/Dog.java
package generics.pets;

public class Dog extends Pet {
  public Dog(String name) { super(name); }
  public Dog() { super(); }
  public void speak(){
    System.out.println("I am Dog");
  }
} ///:~
