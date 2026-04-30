

public class Circle implements Drawable {
    public void draw(){
        System.out.println("circle draw");
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}
