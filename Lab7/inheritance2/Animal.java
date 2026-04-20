

public class Animal {
    public String name; // member var on the top
    // constructor
    // public Animal(){
    //     // autometically added by java
    //     this.name = "animal";
    //     System.out.println("Animal constructor is called");
    // }
    public Animal(String name ){
        this.name = name;
    }
    // member method
    public void eat(){
        System.out.println("Animal is eating.");
    }

    
}
