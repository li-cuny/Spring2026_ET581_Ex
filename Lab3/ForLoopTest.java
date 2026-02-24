public class ForLoopTest {
    public static void firstForLoop(){
        for (int i =10; i > 0; i--){
            System.out.println(i);
        }
    }
    public static void secondForLoop(){
        // print from 0 to 10;
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(i);
        }
    }
    public static void whileLoop(){
        // print from 0 to 10;
       
        int i = 0;  // init
        while(i<=10){ // condition
            System.out.println(i);
            i++;   //update
        }
    }
    public static void thirdForLoop(){
        int i = 0;
        for(;i<=10; ){
            System.out.println(i);
            i++;
        }
    }
    static void forLoopWithBreak(){
        for (int i = 0 ; i<=10 ; i++){
            System.out.println(i);
            if (i==5)break;
        }
        // break will finish for loop
    } 
    static void forLoopWithContinue(){
        for (int i = 0 ; i<=10 ; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
    static void forLoopWithContinue2(){
        for (int i = 0 ; i<=10 ; i++){
            if (i<5||i>7){ // && ||
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args){
        //firstForLoop();
        // secondForLoop();
        // whileLoop();
        // thirdForLoop();
        // forLoopWithBreak();
        forLoopWithContinue2();
    }
}
