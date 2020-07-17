package ServletsClasses;

import Extra.DBHelper;
import Extra.Employee;

public class EmployeeDashboardGetData {
    private String employeeNumber;
    private Employee employee;

    public EmployeeDashboardGetData(String employeeNumber) {
        this.employeeNumber = employeeNumber;
        DBHelper dbHelper = new DBHelper();
        employee = dbHelper.readEmployee(employeeNumber);
    }

    public String getFullName(){ return employee.getName()+" "+employee.getLastName();}

    public String getEmployeeCode(){return employeeNumber;}

    public String getNationalCode(){return String.valueOf(employee.getNationalNumber());}

    public String getBaseSalary(){return employee.getSalaryInformation().getBaseSalary();}
}