import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] intArr = new int[5];
        Animal[] animals = new Animal[5];
        System.out.println(Arrays.toString(animals));
        animals[0] = new Animal();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();
        animals[4] = new Cat();
        System.out.println(Arrays.toString(animals));
        // count how many cat in the array.
        int countCat = 0;
        for (int i =0; i<animals.length; i ++ ){
            Animal animal = animals[i]; // Dog, Cat auto upcasting to Animal type
            boolean isCat = animal instanceof Cat;
            if (isCat ){
                countCat ++;
            }
        }
        System.out.println("countCat is " + countCat);

        // call member method sound();
        for (Animal a: animals){
            a.sound();  // overriden method is dynamically binding method based on actually object type.
        }
    }
}
