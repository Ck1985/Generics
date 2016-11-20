package oracle;

/**
 * Created by Dell Vostro 5459 on 11/20/2016.
 */
//This is a type parameter
public class RawType<T> {
    public void set(T t){

    }
    public static void main(String[] args){
        //When coding programmer provide a type argument(String, Integer ....) for type parameter, to cretae a parameterized type:
        RawType<Integer> rawType = new RawType<>();
        //If the type argument is ommited, so you create the raw type of RawType<T>:
        RawType rawType1 = new RawType();
        //So RawType is a raw type of RawType<T>. But the non-generic class or interface is not a raw type.
    }
}
