public class StringMethodTest {
    public static int addNumber(int a, int b){
        return a + b;
    }
    public static void printString(String x){ // no return type
        System.out.println(x);
        return;
    }
    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "abcde";
        //
        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));

        System.out.println("java".length());
        System.out.println("abcde".equals(s2));

        System.out.println(s1.charAt(0));
        // System.out.println(s1.charAt(7));

        System.out.println(s1.compareTo("12345"));
        System.out.println(s1.compareTo("12346"));
        System.out.println(s1.compareTo("12344"));
        System.out.println(s1.compareTo("12340"));
        System.out.println("a".compareTo("c"));

        // call method
        int result = addNumber(1,1); // 2
        System.out.println("result is " + result);
        result = StringMethodTest.addNumber(1,1); //  class level method because static keyword
        System.out.println("result is " + result);
        StringMethodTest.printString("Hello");

    }

}
