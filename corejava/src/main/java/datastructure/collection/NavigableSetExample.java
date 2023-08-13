package datastructure.collection;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
/*

headSet() : a view of the original NavigableSet which only contains elements that are "less than" the given element.
tailSet() : works the same way as the headSet() method, except it returns all elements that are equal to or higher than the given parameter element.
subSet() :



 */
public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet original = new TreeSet();
        original.add("1");
        original.add("2");
        original.add("3");

        //this headset will contain "1" and "2"
        SortedSet headset = original.headSet("3");
        System.out.println("Headset 3:"+headset);
        //this headset will contain "1", "2", and "3" because "inclusive"=true
        NavigableSet headset1 = original.headSet("3", true);
        System.out.println("Headset 3 (inclusive:true):"+headset1);
    }
}
