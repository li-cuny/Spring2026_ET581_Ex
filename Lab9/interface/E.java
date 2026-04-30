import java.util.Arrays;



public class E implements A{
    public void getA(){
        System.out.println("getA");
    }
    public static void main(String[] args) {
        A[] list = new A[] { new E(), new D(), new E(), new D()};
        // get each element call obj.toString();
        System.out.println(Arrays.toString(list));
        for ( A element : list){
            element.getA();
            if (element instanceof E ){
                System.out.println("the type is E");
            }else {
                System.out.println("the type is D");
            }
            System.out.println(element.getClass());
        }
    }
}
