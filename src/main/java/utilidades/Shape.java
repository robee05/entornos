package utilidades;

public class Shape {
    public static final int SQUARE = 1;
    public static final int CIRCLE = 2;
    public static final int RIGHT_TRIANGULE = 3;

    private final int shapeType;
    private final double size;
    public Shape(int shapeType, double size){
        this.shapeType = shapeType;
        this.size = size;

    }
    public double area(){
        return switch (shapeType) {
            case SQUARE, RIGHT_TRIANGULE -> size * size;
            case CIRCLE -> Math.PI * size * size;
            default -> 0;
        };
    }
}
