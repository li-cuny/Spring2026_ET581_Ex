

public class C implements B{
    public void getA(){
        System.out.println("getA method");
    }
    public void getB(){
        System.out.println("getB method");
    }
    public static void main(String[] args) {
        C c = new C();
        c.getB();
    }
}
