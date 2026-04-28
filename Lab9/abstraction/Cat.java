

public class Cat extends Animal {
    void sound() {
        System.out.println("Cat sound");
    };
    
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[0].eat();
        animals[0].sound();
        System.out.println(animals[0].age);

        //animals[index].sound();
        //Animal a = new Animal()// abstract class not able to creaet obj.
    }
}
