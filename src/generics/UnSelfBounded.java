package generics;

/**
 * Created by anonymous on 1/2/2017.
 */
public class UnSelfBounded<T> {
    T element;
    UnSelfBounded<T> set(T arg){
        this.element = arg;
        return this;
    }
    T get(){
        return this.element;
    }
}
class A2 extends UnSelfBounded<A2>{}
class B2 extends UnSelfBounded<A2>{}
class C2 extends UnSelfBounded<C2>{
    C2 setAndGet(C2 arg){
        this.set(arg);
        return this.get();
    }
}
class D2{}
class E2 extends UnSelfBounded<D2>{}
