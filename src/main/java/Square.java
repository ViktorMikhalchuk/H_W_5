public class Square implements GeometricShape{
    private double side;
    public Square(double side){
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side*side;
    }
}
