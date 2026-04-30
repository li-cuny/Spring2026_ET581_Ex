
public interface A {
    void getA();
    default void getAA(){
        System.out.println("AA");
    }
    static void getStaticA(){
        System.out.println("getSTatic A method");
    }
    // new A(); not possible 
}
