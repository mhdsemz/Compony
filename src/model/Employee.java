package model;

import model.Enums.SalaryRange;

public class Employee {
    private int id;
    private String fullName;
    private String personalCode;
    private int inputYear;
    private SalaryRange salary;

    public Employee(int id, String fullName, String personalCode, SalaryRange valueOf, String inputYear) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public int getInputYear() {
        return inputYear;
    }

    public void setInputYear(int inputYear) {
        this.inputYear = inputYear;
    }

    public SalaryRange getSalary() {
        return salary;
    }

    public void setSalary(SalaryRange salary) {
        this.salary = salary;
    }

    public Employee(int id, String fullName, String personalCode, int inputYear, SalaryRange salary) {
        this.id = id;
        this.fullName = fullName;
        this.personalCode = personalCode;
        this.inputYear = inputYear;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", inputYear=" + inputYear +
                ", salary=" + salary +
                '}';
    }
}
