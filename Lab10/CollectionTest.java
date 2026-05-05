// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Iterator;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args){
        //Collection<String> c1 = new ArrayList<String>();
        Collection<String> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        System.out.println("is collection empty: " + c1.isEmpty());
        c1.add("a");
        c1.add("a");
        c1.add("a");
        c1.add("b");
        c1.add("c"); // c1 [a,a,a,b,c]
        c2.add("a"); // c2 [a]
        System.out.println(c1);
        System.out.println("is collection empty: " + c1.isEmpty());
        c1.remove("a");
        System.out.println(c1);

        // c1.removeAll(c2);
        // c1.removeIf(element -> element.equals("a")); // arrow function 
        // System.out.println(c1);
        // System.out.println(c1.size());

        // collection [a,b,c,d]
        //Iterator
        Iterator<String> it = c1.iterator();//  it -> [a,b,c,d]
        System.out.println("start ===");
        while(it.hasNext()){ // true
            String element = it.next(); // next element
            System.out.println("iterator element " + element);
        }
        System.out.println("end ===");

    }
}