import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i< 5; i++){
            scanner.nextInt();
        }
       
        String text = "this is big string";
       
        String[] strArr = text.split(" "); // instead of StringTokonizer you can use String.split()
        System.out.println(Arrays.toString(strArr));

        scanner.close();

    }
}
