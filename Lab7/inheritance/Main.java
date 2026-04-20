public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println("animal name is " + a.name);
        a.eat();

        Cat c = new Cat();
        System.out.println("cat name is " + c.name);
        c.eat();
        
        Dog d = new Dog();
        System.out.println("dog name is " + d.name);
        d.eat();
    }
}
