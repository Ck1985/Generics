package generics;

/**
 * Created by anonymous on 1/2/2017.
 */
class SubType extends BasicHolder<SubType>{

}
public class CRGWithBasicHolder {
    public static void main(String[] args){
        SubType st1 = new SubType();
        SubType st2 = new SubType();
        st1.set(st2);
        SubType st3 = st1.get();
        st1.f();
    }
}
