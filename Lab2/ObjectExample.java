package Lab2;

public class ObjectExample {
    public static void main(String[] args){
        ObjectExample obj1; // declaration of an obj ref
        obj1 = new ObjectExample(); // Ox1100
        //print out obj1 => Ox1100;
        System.out.println(obj1);
        ObjectExample obj2 = new ObjectExample(); // creating second obj
        System.out.println(obj2);
        System.out.println(obj1 == obj2);
        String str = new String("my string");
        System.out.println("String value is:" + str);
        String str2 = "my second string";
        String str3 =  "123";
        String str4 = "123";
        boolean isStr2EqualStr3 = str2.equals(str3);
        System.out.println(isStr2EqualStr3);
    }
}
