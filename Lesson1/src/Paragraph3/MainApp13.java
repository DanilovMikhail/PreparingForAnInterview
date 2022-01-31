package Paragraph3;

public class MainApp13 {

    public static void main(String[] args){

        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        PerformAnAction(circle);
        PerformAnAction(square);
        PerformAnAction(triangle);

    }

    private static void PerformAnAction(Figure figure){
        figure.draw();
    }

}
