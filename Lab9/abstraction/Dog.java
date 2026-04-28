

public class Dog extends Animal{
    void sound() {
        System.out.println("Dog sound");
    };
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[0].age = 10;
        animals[1] = new Cat();
        animals[1].age = 5;
        animals[2] = new Cat();
        animals[2].age = 9;
        int min = animals[0].age;
        for(int i =0; i<animals.length; i++ ){
            Animal animal = animals[i];
            animal.sound();
            animal.eat();
            System.out.println(animal.age);
            if (animal.age<min){
                System.out.println("index is: " + i);
                System.out.println(animal.getClass());
                min = animal.age;
            }
        }
        System.out.println("min is " + min);
    }
}
