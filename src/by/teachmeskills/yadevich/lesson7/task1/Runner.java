package by.teachmeskills.yadevich.lesson7.task1;

import by.teachmeskills.yadevich.lesson7.task1.employee.Accountant;
import by.teachmeskills.yadevich.lesson7.task1.employee.Director;
import by.teachmeskills.yadevich.lesson7.task1.employee.Worker;

import java.util.Scanner;

/** Создать классы "Директор", "Рабочий", "Бухгалтер".
 * Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
 * Имплементировать этот метод в созданные классы.
 * Создать класс-раннер с методом мейн для запуска программы.
 * Запросить с консоли код должности и вывести название должности на экран.
 */

public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Director");
        Worker worker = new Worker("Worker");
        Accountant accountant = new Accountant("Accountant");

        Scanner sc = new Scanner(System.in);
        System.out.print("1 - Director\n" +
                "2 - Worker\n3 - Accountant\n" +
                "Enter job code:");
        int code = sc.nextInt();
        sc.close();

        System.out.println();

        switch (code){
            case 1:
                director.showPosition();
                break;
            case 2:
                worker.showPosition();
                break;
            case 3:
                accountant.showPosition();
                break;
            default:
                System.out.println("Incorrect value.");
        }
    }
}
