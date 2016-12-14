package Example;

/**
 * Created by anonymous on 12/14/2016.
 */
public class Example_26 {
    public static void main(String[] args){
        Number[] numberArray = new Integer[10];
        try{
            numberArray[0] = new Float(20.5);
        }catch(Exception e){
            System.err.println(e);
        }
        try{
            numberArray[1] = new Double(98.9);
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
