

public class Main {
    public static void main(String[] args) {
        Student  s1 = new Student("Alice",18);
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println("print s1 object address"+ s1);
        s1.printBoth();

        Student s2 = new Student("Charlie");
        s2.printBoth();

    }
}
