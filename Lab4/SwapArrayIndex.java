import java.util.Arrays;

public class SwapArrayIndex {
    static void swapInt(int a, int b){
        a = b; 
    }
    static void swapArrayIndex(int[] a , int firstIndex, int secondIndex){
        // first int location a [firstIndex]
        // second int location a[secondIndex];
        int temp = a[secondIndex];
        a[secondIndex] = a[firstIndex];
        a[firstIndex] = temp;

    }
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        // swap a and b
        //swapInt(a,b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a " + a );
        System.out.println("b " + b );

        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        swapArrayIndex(array, 0, 4);
        System.out.println(Arrays.toString(array));

    }
    
}
