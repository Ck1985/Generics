package oracle.bounedTypeParameter;

/**
 * Created by anonymous on 11/21/2016.
 */
class A{}
class D{}
interface B{}
interface C{}
// Because Java is not allowed multi inheritance so multiBound not allowed
// extends from 2 class .....
public class MultiBound<T extends A & B & C>{
}
