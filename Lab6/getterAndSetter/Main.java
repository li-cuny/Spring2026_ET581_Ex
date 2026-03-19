

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 18);
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        // update value using setter method
        s1.setName("Bob");
        s1.setAge(20);
        // check values
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
