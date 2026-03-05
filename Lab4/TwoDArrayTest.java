import java.util.Arrays;

public class TwoDArrayTest{
    public static void twoDArrayCration(){
        int[][] a = new int[3][4];
        int[][] b = {
            {1,2,3,4}, // index 0 
            {5,6},     // index 1
            {7,8,9, 10} // index 2 
        };
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(b));
        System.out.println(a.length); // how many rows in there
       
        System.out.println(b.length);
        System.out.println(b[0].length); // size of b[0] which is first row
        System.out.println(b[1].length);
        System.out.println(b[2].length);

    }
    static void twoDArrayAssignment(){
        String [][] s = new String[3][4];
        for(int r=0;r<s.length; r++){
            s[r][0] = "Hi";
        }
        System.out.println(Arrays.deepToString(s));
    }
    static void twoDArrayAssignmentWithNestedLoop(){
        String [][] s = new String[3][4];
        for(int r=0;r<s.length; r++){
            for(int c = 0; c< s[r].length; c++){
                 s[r][c] = "Hi";
            }
           
        }
        System.out.println(Arrays.deepToString(s));
    }
    public static void twoDArrayPrint(int[][] a){
        for (int i =0; i < a[0].length; i ++){ // a[0] = {1,2,3}
            System.out.print(a[0][i] + " ");
        }
        System.out.println();
        for (int i =0; i < a[1].length; i ++){ // a[1] = {4,5,6}
            System.out.print(a[1][i] + " ");
        }
        System.out.println();
        for (int i =0; i < a[2].length; i ++){ // a[2] = {7,8,9}
            System.out.print(a[2][i] + " ");
        }
        System.out.println();


    }
    public static void twoDArrayPrintWithNestedFor(int[][] a) {
        for (int r = 0; r<a.length; r++){ // r from 0 -> 2
            for (int i =0; i < a[r].length; i ++){ 
                System.out.print(a[r][i] + " ");
            }
            System.out.println();
        }

    }
    public static void printStar(){
        for (int i =0; i<5; i++ ) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        // twoDArrayCration();
        // twoDArrayAssignment();
        // twoDArrayAssignmentWithNestedLoop();
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // twoDArrayPrint(a);
        // twoDArrayPrintWithNestedFor(a);
        for (int i =0;i<5;i++){
            for (int j =0; j<5; j++ ) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        
      
    }
}