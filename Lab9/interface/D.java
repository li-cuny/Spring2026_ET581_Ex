
public class D implements A{
    public void getA(){
        System.out.println("getA method");
    }
    public static void main(String[] args) {
        D d = new D();
        d.getA();
        d.getAA();
        //d.getStaticA();
        //D.getStaticA();
        A.getStaticA();
    }
}
