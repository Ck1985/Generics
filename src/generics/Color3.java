package generics;

/**
 * Created by anonymous on 1/16/2017.
 */
public class Color3 implements Colored3 {
    private String nameColor = "blue";
    /*public Color3(String nameColor){
        this.nameColor = nameColor;
    }*/
    public String getColor(){
        return this.nameColor;
    }
}
