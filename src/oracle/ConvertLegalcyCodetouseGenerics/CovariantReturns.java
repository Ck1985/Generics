package oracle.ConvertLegalcyCodetouseGenerics;

/**
 * Created by anonymous on 12/6/2016.
 */
// Assume the original API:
class Foo{
    // public Foo create(){}
}
class Bar extends Foo{
    // public Foo create(){}
}
// take advantage of covariant return , we modify:
class Foo2{
    // public Foo create(){}
}
class Bar2 extends Foo2{
    // public Bar create(){}
}
class Baz2 extends Bar2{
    // public Foo create(){}
}
public class CovariantReturns {
    public static void main(String[] args){

    }
}
