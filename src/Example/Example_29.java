package Example;

/**
 * Created by anonymous on 12/19/2016.
 */
import java.util.*;
import generics.Holder;
import static net.mindview.util.Print.*;

public class Example_29 {
    static void checkHolderList(Holder<List<?>> holderList){
        printnb("Calling methods for Holder: ");
        printnb(holderList);
        printnb("holderList.getValue(): " + holderList.getValue());
        print("holderList.setValue(Arrays.asList(1,2,3)): ");
        holderList.setValue(Arrays.asList(1,2,3));
        printnb("holderList.getValue(): " + holderList.getValue());
        int[] integerArray = {1,2,3};
        printnb("int[] integerArray = {1,2,3}");
        printnb("holderList.equals(integerArray): " + holderList.equals(integerArray));
        List integerList = Arrays.asList(integerArray);
        printnb("List integerList = Arrays.asList(integerArray): ");
        printnb("holderList.equals(integerList): " + holderList.equals(integerList));
        List<Integer> l = new ArrayList<Integer>();
        for(int i = 1; i < 4; i++){
            l.add(i);
        }
        printnb("List<Integer> l = new ArrayList<>() and add 1,2,3");
        printnb("holderList.equals(list): " + holderList.equals(l));
        System.out.println();

        printnb("Calling methods for List:");
        printnb("Holder: " + holderList);
        printnb("holderList.getValue().getClass(): " + holderList.getValue().getClass());
        List<?> list = holderList.getValue();
        // list.add(new Object()); can not add anything
        // Incompatible type:
        // List<? extends Integer> list1 = holderList.getValue();
        printnb("list: " + list);
        List list1 = holderList.getValue();
        // list1.add(new Object()); unchecked warning
        printnb("list1.getClass(): " + list1.getClass());
        printnb("list1.equals(list): " + list1.equals(list));
        printnb("list.contains(1): " + list.contains(1));
        Collection<Integer> c = new HashSet<>();
        for(int i = 1; i < 4; i++){
            c.add(i);
        }
        printnb("list.containsAll(c): " + list.containsAll(c));
        printnb("list.equals(c): " + list.equals(c));
        printnb("list: " + list);
        printnb("c: " + c);
        printnb("c.getClass(): " + c.getClass());
        printnb("list.get(0): " + list.get(0));
        printnb("list.indexOf(2): "+ list.indexOf(2));
        printnb("list.hashCode(): " + list.hashCode());
        ListIterator listIterator = list.listIterator();
        printnb("listIterator.next(): " + listIterator.next());
        //Run time Error: UnsupportOperationException
        // list.remove(1);
        // list.removeAll(c);
        // list.retainAll(c);
        // list.set(1, 9); Compile time error: set(int, ?) can not apply for (int, int)
        printnb("list.size(): " + list.size());
        printnb("list.subList(1,2): " + list.subList(1,2));
        Object[] oa = list.toArray();
        printnb("Afyer Object[] oa = list.toArray()");
        printnb("oa = " + oa);
        for(Object o : oa){
            print(o + " ");
        }
        System.out.println();
    }
    static void checkListHolder(List<Holder<?>> listHolder){

    }
    public static void main(String[] args){

    }
}
