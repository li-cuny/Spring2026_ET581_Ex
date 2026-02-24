public class WhileExampleTest {
    // method definition
    static void printTen(){
        int n = 0;
        while(n <= 10 ){
            System.out.println(n);
            if (n % 2 == 1){ // odd 
                System.out.println ( "the number is odd" + n);
            }
            n++; // n = n +1;
        }
        System.out.println("this is end of while loop");
        // ctrl + c 
    }
    // next method definition
    static void printString(String text){
        int index = 0;
        int lengthOfString = text.length();
        while( index < lengthOfString){
            System.out.println(text.charAt(index));
            index ++;
        }
        System.out.println("out of the while loop");
    }
    // next method definition
    static void printChars(String text){
        int index = 0;
        int lengthOfString = text.length();
        while( index < lengthOfString){
            char c = text.charAt(index);
            char newChar = (char)(c + 1); // convert int => char
            System.out.println(newChar);
            index ++;
        }
        System.out.println("out of the while loop");
    }
    public static void main(String[] args){
        // WhileExampleTest.printTen();
        // printString("abcde");
        printChars("abcde");
    }
}