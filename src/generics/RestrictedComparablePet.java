package generics;

/**
 * Created by Dell Vostro 5459 on 1/2/2017.
 */
class Hamster extends ComparablePet implements Comparable<ComparablePet>{
    public int compareTo(ComparablePet arg){ return 0;}
}
//Or just:
class Gecko extends ComparablePet{
    public int compareTo(ComparablePet arg){return 0;}
}
public class RestrictedComparablePet {
    public static void main(String[] args){

    }
}
