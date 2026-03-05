import java.util.Arrays;

public class SortArrayTest {
    static void sortANumber(int[] arr){
        for ( int i =0; i<arr.length-1;i++){ // int[] arr = {5, 2, 9, 1, 3};
            int a = arr[i]; // a = 5;
            int b = arr[i+1];// b = 2
            if (a > b) swap(arr, i, i+1);
        }
    }
    static void swap(int[] arr , int firstIndex, int secondIndex){
        int temp = arr[secondIndex];
        arr[secondIndex] = arr[firstIndex];
        arr[firstIndex] = temp;
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        // for (int i =0; i< 5; i++){
        //     sortANumber(arr);
        // }
        for (int j =0; j< 5; j++){
            for ( int i =0; i<arr.length-1;i++){ // int[] arr = {5, 2, 9, 1, 3};
                int a = arr[i]; // a = 5;
                int b = arr[i+1];// b = 2
                if (a > b) swap(arr, i, i+1);
            }
        }
        
       
    }
}
