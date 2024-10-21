package by.teachmeskills.yadevich.lesson7.task1.employee;

import by.teachmeskills.yadevich.lesson7.task1.action_employee.EmployeeAction;

public class Worker implements EmployeeAction {
    public String position;

    public Worker(String position) {
        this.position = position;
    }

    public void showPosition(){
        System.out.println("Job Title: Worker");
    }
}
