

public class Dog extends Animal {
    // overriding parent sound method
    public void sound(){
        System.out.println("Dog sound");
    }
    public void sound(String name){ // overloading method inside Dog class
        System.out.println("Hi" + name);
    }
    
}
