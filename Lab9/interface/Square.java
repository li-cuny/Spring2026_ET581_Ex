

public class Square implements Drawable, Readable, Playable {
    public void draw(){
        System.out.println("Square draw");
    }
    public void read(){
        System.out.println("Square read");
    }
    public void play(String paper){
        System.out.println("Square play with " + paper);
    }
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        square.read();
        square.play("Yellow paper");
    }
}
