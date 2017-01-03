package generics;

/**
 * Created by Dell Vostro 5459 on 1/3/2017.
 */
interface GenericGetter<T extends GenericGetter<T>>{
    T get();
}
interface Getter extends GenericGetter<Getter>{}
public class GenericsAndReturnTypes {
    public void test(Getter getter){
        Getter getter1 = getter.get();
        GenericGetter getter2 = getter.get();
    }
    public static void main(String[] args){

    }
}
