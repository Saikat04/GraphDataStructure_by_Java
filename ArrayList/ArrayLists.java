//GraphDataStructure_by_Java.ArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.*; //import all packages

public class ArrayLists {
    public static void main(String args[]){
        // #store only objects, and use only heap memory
        ArrayList<Integer> list = new ArrayList<>();
        //Add
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get elements
        int element = list.get(0);
        System.out.println(element);

        //Add elements in between
        list.add(1 , 1);
        System.out.println(list);

        //Set element
        list.set(0,5);
        System.out.println(list);

        //Delete Element
        list.remove(1);
        System.out.println(list);

        //Size
        int size = list.size();
        System.out.println(size);

        //Loops
        for(int i = 0 ; i < size ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
