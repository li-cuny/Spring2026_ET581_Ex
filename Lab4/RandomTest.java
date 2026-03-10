import java.util.Random;

public class RandomTest {
    public static void mathRandomTest(){
        double randomDouble = Math.random(); // static method using className.method();
        System.out.println(randomDouble);
        int randomInt = (int) (randomDouble * 10);
        System.out.println(randomInt); // [0 - 10)
        int randomIntUntilTen = (int) (randomDouble * 11);
        System.out.println(randomIntUntilTen); // [0 - 10]
        int randomIntFrom10To20 = randomIntUntilTen + 10;
        System.out.println(randomIntFrom10To20);
    }
    public static void mathMaxTest(){
        int a =5, b =6;
        if (a <b) System.out.println("a < b");
        int min = Math.min(a,b);
        System.out.println("min is : " + min);
        int[] arr = {1,2,3,4,5};
        // find max using Math.max();
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max,arr[i]);
        }
        System.out.println("max is: "+ max);
    }
    public static void randomClassTest(){
        Random r = new Random();
        System.out.println(r.nextBoolean());
        System.out.println(r.nextDouble());
        System.out.println(r.nextInt(10));
        Random r2 = new Random(10);   // 10 is the seed
        System.out.println(r2.nextInt(100));
        System.out.println(r2.nextInt(100));
    }
    public static void main(String[] args) {
        // mathRandomTest();
        //RandomTest.mathMaxTest();
        RandomTest.randomClassTest();
    }
}