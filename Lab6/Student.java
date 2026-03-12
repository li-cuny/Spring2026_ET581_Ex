class Student {
    // add member variables
    String name;
    int age;
    // constructor
    Student(){ // no pram constructor
       System.out.println("the Student() constructor is called");
       name = "default name" ;
       age = 1;
    }
   
    Student(String n, int a){
         System.out.println("the  Student(String n, int a) constructor is called");
        name = n;
        age = a;
    }
    // add member method
    void print(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    void printWithParam(String member){
        if (member.equals("age")){
            System.out.println("age: " + age);
        }else {
            System.out.println("name: " + name);
        }
    }
}