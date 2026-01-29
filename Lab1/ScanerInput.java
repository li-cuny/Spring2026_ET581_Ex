import java.util.Scanner;

public class ScanerInput {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        String z = input.next();
        System.out.println(x);
        System.out.print(y );
        System.out.print("\n");
        System.out.println(z);
        input.close();
    }
}
