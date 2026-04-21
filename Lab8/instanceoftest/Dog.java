public class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Dog sound");
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        //Dog dog = (Dog) animal; // 
        Animal animal2 = new Dog();
        if(animal2 instanceof Dog){
            Dog dog2 = (Dog) animal2;
            System.out.println(dog2 instanceof Dog);

        }
      
       
    }
}
