package generics;

/**
 * Created by anonymous on 12/30/2016.
 */
import java.util.*;
import java.io.*;

public class ClassCasting {
    @SuppressWarnings("unchecked")
    public void f(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(args[0]));
        // List<Widget> lw1 = List<Widget>.class.cast(in.readObject());
        List<Widget> lw2 = List.class.cast(in.readObject());
    }
    public static void main(String[] args){

    }
}
