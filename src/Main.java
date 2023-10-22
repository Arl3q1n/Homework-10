import java.sql.SQLOutput;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n---------------------------\n");

        Polygon polygon = new Polygon();
        Square square = new Square();
        Circle circle = new Circle();

        polygon.render();
        square.render();
        circle.render();

    }
}