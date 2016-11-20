package oracle;

/**
 * Created by Dell Vostro 5459 on 11/21/2016.
 */
public class WarningDemo {
    public static void main(String[] args){
        BoxVersion2<Integer> integerBox = createBox();
    }
    public static BoxVersion2 createBox(){
        return new BoxVersion2();
    }
}
