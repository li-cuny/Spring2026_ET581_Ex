

public class Student {

    private String name;
    private int age;

    Student(String name, int age){
        this.commonMethod(name);
        this.age = age;
    }
    Student (String name){
        this.commonMethod(name);
    }
    // getter methods

    private void commonMethod(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    //setter method
    public void setName(String n){
        name = n;
    }
    public void setAge(int a){
        age = a;
    }

    // print method
    public void printName (){
        System.out.println("student name is " + this.name);
    }
    public void printAge(){
        System.out.println("student age is " + this.age);
    }
    public void printBoth(){
        System.out.println(this);
        this.printName();
        this.printAge();
    }

}