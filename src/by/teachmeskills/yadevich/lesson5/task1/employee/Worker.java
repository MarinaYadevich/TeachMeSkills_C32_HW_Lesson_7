package by.teachmeskills.yadevich.lesson5.task1.employee;

import by.teachmeskills.yadevich.lesson5.task1.action_job.Employee;

public class Worker implements Employee {
    public String position;

    public Worker(String position) {
        this.position = position;
    }

    public void showPosition(){
        System.out.println("Job Title: Worker");
    }
}
