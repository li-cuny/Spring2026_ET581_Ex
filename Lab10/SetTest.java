import java.util.*;
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        boolean b1 = s1.add(1);
        s1.add(2);
        boolean b2 = s1.add(1);
        s1.add(null);
        System.out.println(s1);
        System.out.println("first bool : " + b1 + " second bool: " + b2);
    }
}
