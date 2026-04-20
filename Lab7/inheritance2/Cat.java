

public class Cat extends Animal{
    // auto add constructor for you

    public int age;

    public Cat (){
        super("cat"); // call parent constructor
        this.age = 3;
        System.out.println("Cat constructor is called");
    }
    public void sound(){
        System.out.println("Cat sound");
    }
}
