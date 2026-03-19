public class Student {
    String name; // Alice
    int age;
    Student(String name, int age){
        this(name); // calling a constructor with one param Stirng name type // first line is calling constructor
        this.age = age;
       
    }
    Student (String name){
        this.name = name;
    }
    public void greet(Student other){ //Bob
        System.out.println("current student name: " + this.name + " other name: " + other.name);
    }
    public static void main(String[] args){
        Student s1 = new Student("Alice",18);
        Student s2 = new Student("Bob",20);
        s1.greet(s2);
        s2.greet(s1);
        s1.greet(s1);

        // greet(new Student("Bob",20));
    }
}