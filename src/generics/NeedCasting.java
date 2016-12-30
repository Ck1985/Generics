package generics;

/**
 * Created by anonymous on 12/30/2016.
 */
import java.io.*;
import java.util.*;

public class NeedCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        List<Widget> list = (List<Widget>)in.readObject();
    }
    public static void main(String[] args){

    }
}
