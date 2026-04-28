
abstract public class Animal {
    public int age; // memeber var

    Animal(){  // constructor
    };
    public void eat(){ // member method
        System.out.println("Animal eat.");
    }
    abstract void sound();// do not creating method body{}

    public static void main(String[] args) {
        // Animal a = new Animal();
        // a.eat();
        // ctrol + "/"
    }
}
