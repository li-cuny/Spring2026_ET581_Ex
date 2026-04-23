
import parent.Parent;
import child.Child;
public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        c.getX();
        //p.x;  // public member var
        System.out.println("Main end");
    }
}
