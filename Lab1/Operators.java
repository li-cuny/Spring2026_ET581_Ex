public class Operators {
    public static void main(String[] args){
        int x = 1;
        // double y = 2.0;
        // System.out.println(x+y);
        // System.out.println(3.0/2);
        // //int devision
        // System.out.println( 5 / 2); // whole number
        // System.out.println(5 % 2); //remainder
        //ctrl + /

        x = 3;
        System.out.println("Post increament");
        System.out.println(x++);
        System.out.println(x);
        System.out.println("Pre increament");
        System.out.println(++x);
        System.out.println(x);

        // type casting
        int intNumber = 1;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);
        int castToInt = (int) doubleNumber;
        System.out.println(castToInt);

    }
}