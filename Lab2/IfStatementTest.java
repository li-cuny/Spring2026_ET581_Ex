package Lab2;

public class IfStatementTest {

    public static boolean isEvenNumber(int n){
        if (  n % 2 == 0 ){
            return true;
        } else {
            return false;
        }

    }
    public static void testSwitchStatement(int choice){
       
        switch (choice) {
            case 1:
                System.out.print("One ");
               
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            default:
                System.out.print("Default ");
        }
        
    }

    public static void main(String[] args) {
        // System.out.println(isEvenNumber(4));
        testSwitchStatement(1);
        testSwitchStatement(2);
        testSwitchStatement(3);
        testSwitchStatement(4);
        testSwitchStatement(5);
    }

}