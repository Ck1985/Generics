package Example;

/**
 * Created by anonymous on 11/11/2016.
 */
import generics.*;

public class Example5 {
    public static void main(String[] args){
        LinkedStackVer2<String> stack = new LinkedStackVer2();
        String string = "cao xuan quy handsome hahahahh";
        for(String str : string.split(" ")){
            stack.push(str);
        }
        String result = null;
        while((result = stack.pop()) != null){
            System.out.print(result + " ");
        }
    }
}
