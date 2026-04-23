
 public final class Parent { // final class can not be extended.
    // final var
    // final int x = 10;
    final int x;
    Parent(){
        this.x = 30;
    }
    // final void printX(){ // final method is not able to override from child class.
    //         System.out.println("x is " + this.x);
    // }
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.x);
        //p.x = 20; // can not change once assigned.
        System.out.println(p.x);
    }
}
