public class LogicalOperatorTest {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(n == 1 || n++ ==1);  // true || anything => true
        System.out.println(n); // 1

        System.out.println(n ==1 && n++ ==1); // true and something
        System.out.println(n); // 2
    }
}