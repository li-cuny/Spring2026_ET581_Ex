public class Main {

    public static void classAndObject(){
         new Student(); // do not have refrence, can not use it again.
        Student s1 = new Student();  // s1 is a refference;
        System.out.println(s1);
        System.out.println(new Student());
        System.out.println(new Student());
        System.out.println("the end");
    }
    public static void memberVariable(){
        Student s1 = new Student();
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.name = "Alice";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);

        Student s2 = new Student();
        System.out.println(s2);
        System.out.println(s2.name);
        System.out.println(s2.age);
        s2.name = "Bob";
        s2.age = 21;
        System.out.println(s2.name);
        System.out.println(s2.age);

    }
    static void memberMethod(){
        Student s1 = new Student();
        // we have 3 members that are name, age, print()
        s1.print(); // obj + dot + membername (if method add ())
        s1.name = "Charlie";
        s1.age = 18;
        s1.print();
        s1.printWithParam("age");

    }
    static void constructor(){
        Student s1 = new Student();
        s1.print();
        Student s2 = new Student("David", 15);
        s2.print();

    }
    public static void main(String[] args) {
       //memberVariable();
    //    memberMethod();
        constructor();
    }
}
