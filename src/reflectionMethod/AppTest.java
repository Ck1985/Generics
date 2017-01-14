/**
 * Created by anonymous on 1/14/2017.
 */
package reflectionMethod;

public class AppTest {
    private int counter;
    public void printIT(){
        System.out.println("printIT() no params");
    }
    public void printItString(String temp){
        System.out.println("printItString() has a params: " + temp);
    }
    public void printItInt(int temp){
        System.out.println("printItInt() has a param: " + temp);
    }
    public void setCounter(int counter){
        this.counter = counter;
        System.out.println("setCounter() set counter to: " + counter);
    }
    public void printItCounter(){
        System.out.println("printItCounter() print counter: " + this.counter);
    }
}
