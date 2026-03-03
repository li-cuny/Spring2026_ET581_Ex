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
    public static void main(String[] args){
        // twoDArrayCration();
        // twoDArrayAssignment();
        twoDArrayAssignmentWithNestedLoop();
    }
}