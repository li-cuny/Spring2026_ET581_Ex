package Lab5;

public class MethodOverloading {
    // overloading method
    // 1. same name,
    // 2. diff param
    // 3. in one class / same class
    static int get(){
       
        return 0;
    }
    static int get(int x){
        return 1;
    }
    static int get(double x){
        return 2;
    }
    public static void main(String[] args) {
        // compile time 
        int result = get();
        System.out.println(result);
        result = get(1.0);
        System.out.println(result);
        result = get(10);
        System.out.println(result);

    }
}
