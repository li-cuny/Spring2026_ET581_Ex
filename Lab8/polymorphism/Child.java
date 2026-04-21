public class Child extends Parent{
    public int x = 20;  // member var is compile time binding.
    // @Override
    // public void show() { // overriden method  binding is in runtime.
    //     System.out.println("Child show()");
    // }

    @Override // recommend override annoation
    public void show(){
        System.out.println("Child Show()");
    }
}
