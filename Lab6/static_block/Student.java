

public class Student {
    String name;
    int age;
    static int count =1;
    { // instance block
        System.out.println("instance block executed");
    }
    static {
        System.out.println("static block execuetd");
        count =2;
    }
    Student(String name, int age){
        System.out.println("constructor is executed");
        this.name = name;
        this.age =age;
    }
    public static void main(String[] args) {
        System.out.println("main method execueted");
        Student s1 = new Student("Alice", 18);
        Student s2 = new Student ("Bob", 20);
    }
}
