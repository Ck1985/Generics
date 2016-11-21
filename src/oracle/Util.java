package oracle;

/**
 * Created by anonymous on 11/21/2016.
 */
public class Util {
    public  static <K, V> boolean compare(Pair2<K, V> p1, Pair2<K, V> p2){
        return (p1.getK().equals(p2.getK()) && p1.getV().equals(p2.getV()));
    }
    public static void main(String[] args){
        Pair2<String, Integer> p1 = new Pair2<>("anonymous", 11100001);
        Pair2<String, Integer> p2 = new Pair2<>("anonymous", 11100001);
        System.out.println(Util.<String, Integer>compare(p1, p2));
    }
}
