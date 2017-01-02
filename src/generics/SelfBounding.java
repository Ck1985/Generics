package generics;

/**
 * Created by anonymous on 1/2/2017.
 */
class SelfBounded<T extends SelfBounded<T>>{
    T element;
    SelfBounded<T> set(T arg){
        this.element = arg;
        return this;
    }
    T get(){
        return this.element;
    }
}
class A extends SelfBounded<A>{

}
class B extends SelfBounded<A>{

}
class C extends SelfBounded<C>{
    C setAndGet(C arg){
        this.set(arg);
        return this.get();
    }
}
class D{}
// This won't compile....
// class E extends SelfBounded<D> {}
class F extends SelfBounded{}
public class SelfBounding {
    public static void main(String[] args){
        A a = new A();
        a.set(new A());
        a = a.set(new A()).get();
        a = a.get();
        C c = new C();
        c = c.setAndGet(new C());
    }
}
