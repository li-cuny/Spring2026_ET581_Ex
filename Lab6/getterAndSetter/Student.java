

public class Student {

    private String name;
    private int age;

    Student(String n, int a){
        name = n;
        age = a;
    }
    // getter methods

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

}