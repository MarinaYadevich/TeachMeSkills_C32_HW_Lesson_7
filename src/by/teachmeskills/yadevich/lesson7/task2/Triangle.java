package by.teachmeskills.yadevich.lesson7.task2;

public class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double area = (a + b + c) / 2.0;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    void getInformation() {
        System.out.println("Triangle: a - " + a + ", b - " + b + ", c - " + c);
    }
}

