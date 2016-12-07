package generics;

/**
 * Created by anonymous on 12/6/2016.
 */
class Employee2{}
class ClassAsFactory<T>{
    T t;
    public ClassAsFactory(Class<T> tClass){
        try{
            T t = tClass.newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
public class InstantiatieGenericType {
    public static void main(String[] args){
        ClassAsFactory<Employee2> fe = new ClassAsFactory<Employee2>(Employee2.class);
        System.out.println("ClassAsFactory<Employee2> successed !");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<>(Integer.class);
        }catch(Exception e){
            System.out.println("ClassAsFactory<Integer> failed !!!");
        }
    }
}
