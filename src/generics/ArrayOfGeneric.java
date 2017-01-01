package generics;

/**
 * Created by Dell Vostro 5459 on 12/12/2016.
 */
public class ArrayOfGeneric {
    private static final int SIZE = 100;
    private static Generics<Integer>[] gia;
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        //Compile error: Class Cast Exception
        //! gia = (Generics<Integer>[])new Object[SIZE];
        //Run time type is raw (erased) type:
        gia = (Generics<Integer>[])new Generics[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generics<Integer>();
        //! gia[1] = new Object(); //Compile -time error
        //! gia = new Generics<Double>();
    }
}
