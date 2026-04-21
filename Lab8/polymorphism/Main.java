public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();
        Child c = new Child();
        c.show();
        Parent p2 = c;
        p2.show();
        //
        System.out.println("p.x value is " + p.x);
        System.out.println("c.x value is " + c.x);
        System.out.println("p2.x value is " + p2.x);
    }
}
