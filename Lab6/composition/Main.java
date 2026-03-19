

public class Main {
    public static void main(String[] args) {
        Address address = new Address("NY", "US");
        Student s = new Student("Alice", 20, address);
        System.out.println("name:" + s.name + " age: " + s.age + " address: " + s.address );
    }
    
}
