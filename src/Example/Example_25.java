package Example;

/**
 * Created by Dell Vostro 5459 on 12/13/2016.
 */
interface SuperHearing{

}
interface SuperSmell{

}
class SuperFind implements SuperHearing, SuperSmell{
    public String toString(){
        return "SuperFind Class";
    }
}
public class Example_25 {
    public static <T extends SuperHearing> void hear(T t){
        System.out.println(t);
    }
    public static <T extends SuperSmell> void smell(T t){
        System.out.println(t);
    }
    public static void main(String[] args){
        SuperFind superFind = new SuperFind();
        hear(superFind);
        smell(superFind);
    }
}
