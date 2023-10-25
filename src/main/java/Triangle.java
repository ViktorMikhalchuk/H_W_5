public class Triangle implements GeometricShape{
    private double side_a,side_b;

    public Triangle(double side_a,double side_b){
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double calculateArea() {
        return (side_a*side_b)/2;
    }
}

