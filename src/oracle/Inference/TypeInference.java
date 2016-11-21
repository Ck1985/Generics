package oracle.Inference;

/**
 * Created by anonymous on 11/21/2016.
 */
import java.io.*;
import java.util.*;

public class TypeInference {
    public static <T> T pick(T t1, T t2){
        return t2;
    }
    public static void main(String[] args){
        Serializable s = pick("anonymous", new ArrayList<String>());
    }
}
