package by.teachmeskills.yadevich.lesson7.task1.employee;

import by.teachmeskills.yadevich.lesson7.task1.action_employee.EmployeeAction;

public class Accountant implements EmployeeAction {
    public String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void showPosition() {
        System.out.println("Job Title: Accountant");
    }
}
