import java.sql.SQLOutput;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n---------------------------\n");

        Square square = new Square();
        Circle circle = new Circle();

        Polygon squarePolygon = new Square();
        Polygon circlePolygon = new Circle();


        square.render();
        circle.render();

        squarePolygon.render();
        circlePolygon.render();

    }
}