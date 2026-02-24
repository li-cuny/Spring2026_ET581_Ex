import java.util.Arrays;

public class ArrayTest{
    public static void arrayLengthTest(){
        int[] a1 = new int[3];
        System.out.println(a1.length);
    }
    public static void assignmentArrayByIndex(){
        int[] a1 = new int[3];// [0, 0, 0 ]
        System.out.println(Arrays.toString(a1));
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        System.out.println(Arrays.toString(a1));
        System.out.println( a1[2]);
        int valueOfIndexOne = a1[1];
        System.out.println(valueOfIndexOne);

    }
    static void printArray(){
        int[] a1 = new int[] {1,3,5,6};
        // for loop (init; condition; update)
        for ( int index = 0; index < a1.length; index ++){
            System.out.println("index: " + index + " value at index: " + a1[index]);
        }
    }
    static void printInReverseOrder(){
        String[] s = new String[] {"first","second","third"};
        for(int index = s.length - 1; index >= 0; index--){
            System.out.println( s [index]);
        }
        // System.out.println(s[4]);
    }
    static void forEachLoop(){
        int[] a = {10, 20, 30,40};
        for( int e : a){
            System.out.println(e);
        }
    }
    static void passingArrayToMethod( int[] array){ // array { 1 5 7 }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        // int[] array1 = new int[3]; // [0 0 0 ]
        // //System.out.println(array1[0]);
        // System.out.println(Arrays.toString(array1));

        // int[] a2 = { 1, 2, 3, 4, 5};
        // System.out.println(Arrays.toString(a2));

        // int[] a3 = new int[]{2,5,6};
        // System.out.println(Arrays.toString(a3));

        // arrayLengthTest();
        // assignmentArrayByIndex();
        // printArray();
        // printInReverseOrder();
        // forEachLoop();
        int[] array = { 1,5, 7};
        passingArrayToMethod(array);
    }
}