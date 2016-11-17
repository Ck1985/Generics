package generics;

/**
 * Created by anonymous on 11/17/2016.
 */
import generics.watercolors.*;
import java.util.*;
import static generics.watercolors.WaterColors.*;
import util.Sets.*;
import static util.Sets.*;

public class WaterColorsSet {
    public static void main(String[] args){
        Set<WaterColors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<WaterColors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union(set1, set2): " + union(set1, set2));
        Set<WaterColors> subset = intersection(set1, set2);
        System.out.println(subset);
        System.out.println("difference(set1, subset): " + difference(set1, subset));
        System.out.println("difference(set2, subset): " + difference(set2, subset));
        System.out.println("complement(set1, set2): " + complement(set1, set2));
    }
}
