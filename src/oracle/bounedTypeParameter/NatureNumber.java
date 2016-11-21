package oracle.bounedTypeParameter;

/**
 * Created by anonymous on 11/21/2016.
 */
public class NatureNumber<T extends Integer> {
    private T t;
    public NatureNumber(T t){
        this.t = t;
    }
    public boolean checkEven(){
        return this.t.intValue() % 2 == 0;
    }
    public static void main(String[] args){
        NatureNumber<Integer> number = new NatureNumber<>(90);
        System.out.println(number.checkEven());
    }
}
