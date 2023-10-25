public class Aplication {
    public static void main(String[] args) {
GeometricShape [] shapes = new GeometricShape[3];
shapes[0] = new Circle(3.3);
shapes[1] = new Triangle(2.2,1.1);
shapes[2] = new Square(2.0);
//        System.out.println("Circle: " + shapes[0].calculateArea());
//        System.out.println("Triangle: " + shapes[1].calculateArea());
//        System.out.println("Square: " + shapes[2].calculateArea());

        double totalArea = 0.0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        System.out.println("Сумарна площа всіх фігур: " + totalArea);

        Participant[] participants = {
                new Human("Oleg"),
                new Cat("Tom"),
                new Robot("Werter")};
Obstacle[] obstacles = {
        new RunningTrack(100),
        new Wall(1)
//        new RunningTrack(300),
//        new Wall(2)
        };

for (Participant participant:participants){
    for (Obstacle obstacle:obstacles){
       obstacle.overcome(participant);
    }
}
    }
}
