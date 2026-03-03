public class ExerciseLab4{
    public static void printTwoDArray(){
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i =0 ; i< arr.length;i++ ) {
            for (int j =0; j< arr[i].length ; j++ ){
                System.out.println(arr[i][j]);
            }
        }
        
    }
    public static void main (String[] args){
        printTwoDArray();
    }
}