package geometry;
import shapes.Square;

public class Cube implements Geometry {
    private Square baseShape;

    // Constructor for Cube with only a square as base shape
    public Cube(Square baseShape) {
        this.baseShape = baseShape;
    }

    @Override
    public double calculateVolume() {
        return baseShape.calculateArea() * baseShape.calculateArea() * baseShape.calculateArea(); 
    }

    @Override
    public double calculateBaseArea() {
        return baseShape.calculateArea();
    }
}
