package access_modifier;

public class Student {
   private String name;
   private int age; 
   public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
   }
}
