package homework_nr_4;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circleIgorek = new Circle(25.22003420);
        System.out.println("Площадь круга: " + circleIgorek.calculateArea());
    }
}

