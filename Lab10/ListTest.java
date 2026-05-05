import java.util.*;
public class ListTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        // collection method
        l1.add("a");
        l1.add("b");
        l1.add("c");
        // list method index based.
        l1.add(1,"d");
        l1.add(null);
        System.out.println(l1);
        // listIterator
        ListIterator<String> it = l1.listIterator();
        System.out.println("start====");
        while(it.hasNext()){
            String element = it.next();
            System.out.println(element);
        }
        System.out.println("end====");
        System.out.println("start====");
        while(it.hasPrevious()){
            String element = it.previous();
            System.out.println(element);
        }
        System.out.println("end====");


        l2.add(1);
        l2.add(10);
        System.out.println(l2);

    }
}
