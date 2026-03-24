package Lab7.innerclass;

public class A {
    int x = 0; // first member 
    void findX(){ // second member
        System.out.println("findX is called");
    }
    // third member which is class definition
    public class B {
        public int y = 1; //. class B first member
        public void findY(){ // B second member
            System.out.println("findY is called.");
        }

    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
        a.findX();
        A.B aMemberB = a.new B();
        aMemberB.y = 3;
        aMemberB.findY();
        System.out.println(aMemberB.y);
    }
}
