package Example;

/**
 * Created by anonymous on 11/19/2016.
 */
interface Interface_Ex20{
    void method_1();
    void method_2();
}
class Class_Ex20 implements Interface_Ex20{
    public void method_1(){
        System.out.println("Method_1");
    }
    public void method_2(){
        System.out.println("Method_2");
    }
    void method_3(){
        System.out.println("Method_3");
    }
}
class Class_Ex20A<T extends Interface_Ex20>{
    private T object1;
    private T object2;
    public void manipulate(){
        object1.method_1();
        object2.method_2();
    }
}
public class Example20 {
}
