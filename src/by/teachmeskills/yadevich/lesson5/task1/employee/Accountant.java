package by.teachmeskills.yadevich.lesson5.task1.employee;

import by.teachmeskills.yadevich.lesson5.task1.action_job.Employee;

public class Accountant implements Employee {
    public String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void showPosition() {
        System.out.println("Job Title: Accountant");
    }
}
