//: typeinfo/pets/Cat.java
package generics.pets;

public class Cat extends Pet {
  public Cat(String name) { super(name); }
  public Cat() { super(); }
  public void speak(){
    System.out.println("I am a Cat");
  }
} ///:~
