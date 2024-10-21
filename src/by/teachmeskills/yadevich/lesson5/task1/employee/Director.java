package by.teachmeskills.yadevich.lesson5.task1.employee;

import by.teachmeskills.yadevich.lesson5.task1.action_employee.EmployeeAction;

public class Director implements EmployeeAction {
    public String position;

    public Director(String position) {
        this.position = position;
    }

    public void showPosition(){
        System.out.println("Job Title: Director");
    }
}
