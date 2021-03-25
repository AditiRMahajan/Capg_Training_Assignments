abstract class Shape{
    abstract void draw();
}
class Line extends Shape{
    void draw(){
        System.out.println("Line drawing");
    }
}
class Rectangular extends Shape{
    void draw(){
        System.out.println("Rectangle drawing");
    }
}
class Cube extends Shape{
    void draw(){
        System.out.println("Cube drawing");
    }
}


public class Shapes {
    public static void main(String[] args) {
        Shape s;
        s= new Line();
        s.draw();
        s = new Rectangular();
        s.draw();
        s = new Cube();
        s.draw();
    }
}