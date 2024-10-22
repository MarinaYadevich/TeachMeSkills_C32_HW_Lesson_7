package by.teachmeskills.yadevich.lesson7.task2;

public class Rectangle extends Figure {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        double area = length * width;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * (length * width);
        return perimeter;
    }

    @Override
    void getInformation() {
        System.out.println("Rectangle: length - " + length + ", width - " + width);
    }
}
