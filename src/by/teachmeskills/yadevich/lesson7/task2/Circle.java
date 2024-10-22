package by.teachmeskills.yadevich.lesson7.task2;

public class Circle extends Figure {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    void getInformation() {
        System.out.println("Radius circle: " + radius);
    }

}
