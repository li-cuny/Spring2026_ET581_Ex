

public class Student {
    String name;
    int age;
    static int count;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    void print(){
        System.out.println("name: " + this.name + " age: " + this.age);
    }
    static void hello(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        // System.out.println(Student.count);
        // Student.count = 1;
        // System.out.println(Student.count);
        // Student a = new Student("Alice", 18);
        // Student b = new Student("Bob", 20);
        // a.count = 2;
        // System.out.println(a.count); // Student.count
        // System.out.println(b.count);
        Student s1 = new Student("Alice", 18);
        s1.print();
        // print(); // non static method must need to create object first.
        Student.hello();// class level method
        s1.hello(); // not recomanded.
    }
}
