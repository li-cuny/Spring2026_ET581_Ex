package Lab5;

public class ScopeTest {
    // 1. class scope
    static int x = 1;
    static void get(){
        System.out.println("get() is called");
    }
    // 2. method scope
    static void methodScopeTest(){
        int y = 2;
    }
    // 3. block scope 
    static void blockScopeTest(){
        int x = 3;
        if (x==3){
            int y = 4;
            System.out.println(y);
        }
        // System.out.println(y);
    }
    public static void main(String[] args) {
        System.out.println("class scope var x:" + x);
        ScopeTest.get();
        System.out.println(ScopeTest.x);
        //System.out.println(ScopeTest.y); out of method scope

    }
}
