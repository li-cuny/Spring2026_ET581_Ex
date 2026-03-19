

import java.util.Arrays;

public class Student {
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
 
    public String toString() {
        
        return "name is : "+ this.name + " age is : "+ this.age;
    }
    public static void main(String[] args) {
        // array of Student
        // int[] arr = new int[5];
        // type[] arr = new type [5];
        Student[] arr = new Student [5];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i< arr.length;i++){
            arr[i] = new Student("Alice",i);
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0; i< arr.length;i++){
        //     Student current = arr[i];
        //     System.out.println("name of current student is : " + current.name);
        //     System.out.println("age of current student is : " + current.age);
        // }
    }
}
