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
        printArray();
    }
}