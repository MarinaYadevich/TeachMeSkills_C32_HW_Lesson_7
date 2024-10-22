package by.teachmeskills.yadevich.lesson7.task2;

public class ApplicationRunner {
    public static void main(String[] args) {
        Circle circle =  new Circle(2);
        Rectangle rectangle1 = new Rectangle(2,4);
        Rectangle rectangle2 = new Rectangle(6,9);
        Triangle triangle1 = new Triangle(4,6,5);
        Triangle triangle2 = new Triangle(2,3,3);
        Triangle triangle3 = new Triangle(6,7,8);

        System.out.println("Area circle: " + circle.calculateArea());
        System.out.println("Perimeter circle: " + circle.calculatePerimeter());
        System.out.println();
        System.out.println("Area rectangle1: " + rectangle1.calculateArea());
        System.out.println("Perimeter rectangle1: " + rectangle1.calculatePerimeter());
        System.out.println();
        System.out.println("Area rectangle2: " + rectangle2.calculateArea());
        System.out.println("Perimeter rectangle2: " + rectangle2.calculatePerimeter());
        System.out.println();
        System.out.println("Area triangle1: " + triangle1.calculateArea());
        System.out.println("Perimeter triangle1: " + triangle1.calculatePerimeter());
        System.out.println();
        System.out.println("Area triangle2: " + triangle2.calculateArea());
        System.out.println("Perimeter triangle2: " + triangle2.calculatePerimeter());
        System.out.println();
        System.out.println("Area triangle3: " + triangle3.calculateArea());
        System.out.println("Perimeter triangle3: " + triangle3.calculatePerimeter());
        System.out.println();

        Figure[] figures = {circle, rectangle1, rectangle2, triangle1, triangle2};

        for (Figure figure : figures) {
            figure.getInformation();
        }

        double sumPerimeters = 0;
        for (Figure figure : figures) {
            sumPerimeters += Math.round(figure.calculatePerimeter());

        }
        System.out.println(sumPerimeters);
    }
}
