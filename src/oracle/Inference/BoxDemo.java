package oracle.Inference;

/**
 * Created by anonymous on 11/21/2016.
 */
import java.util.*;
public class BoxDemo {
    public static <U> void addBox(U u, List<Box<U>> listBox){
        Box<U> box = new Box<>();
        box.setT(u);
        listBox.add(box);
    }
    public static <U> void outputBox(List<Box<U>> listBox){
        int count = 0;
        for(Box<U> box : listBox){
            count++;
            System.out.println("Box #" + count + " contains [" + box.getT() + "]");
        }
    }
    public static void main(String[] args){
        List<Box<Integer>> listBox = new ArrayList<>();
        Box<Integer> box1 = new Box<>();
        box1.setT(10);
        Box<Integer> box2 = new Box<>();
        box2.setT(15);
        Box<Integer> box3 = new Box<>();
        box3.setT(20);
        listBox.add(box1);
        listBox.add(box2);
        listBox.add(box3);
        BoxDemo.outputBox(listBox);
    }
}
