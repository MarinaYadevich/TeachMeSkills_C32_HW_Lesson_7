package by.teachmeskills.yadevich.lesson7.task2;

public abstract class Figure {
    public int width;
    public int height;
    public int length;


// площадь треугольника
    public void getAreaTriangle(int width, int height){
        int areaTriangle = (width * height) / 2; /** 2 - постоянное число, использующаяся в формуле  */
        System.out.println("Area of the triangle: " + areaTriangle);
    }
// периметр треугольника
    public void getPerimeterTriangle(int length1, int length2, int length3 ) {
        int perimeterTriangle = length1 + length2 + length3;
        System.out.println("Perimeter of the triangle: " + perimeterTriangle);
    }
// площадь прямоугольника
    public void getAreaRectangle(int length, int width){
        int areaRectangle = length * width;
        System.out.println("Area of the rectangle: " + areaRectangle);
    }

// периметр прямоугольника
    public void  getPerimeterRectangle(int length, int width){
        int perimeterRectangle = (length + width) * 2; /** 2 - постоянное число в формуле */
        System.out.println("Perimeter of the rectangle: " + perimeterRectangle);
    }

//площадь круга
    public void getAreaCircle(double radius){
        double areaCircle = 3.14 * (radius * radius); /** Пи - математическая константа, примерно равная 3,14 */
        System.out.println("Area of the circle: " + areaCircle);
    }

// периметр круга
    public void getPerimeterCircle(double radius){
        double perimeterArea = 2 * 3.14 * radius; /** Пи - математическая константа, примерно равная 3,14*/
    }
}
