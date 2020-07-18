package ServletsClasses;

import Extra.*;

import java.util.ArrayList;

public class EmployeeSalaryReceiptGetData {
    public EmployeeSalaryReceiptGetData(String employeeNumber) {
        this.employeeCode = employeeNumber;
        dbHelper = new DBHelper();
        receipt = dbHelper.readReceipt(employeeNumber);
        employee = dbHelper.readEmployee(employeeNumber);
        jobInformation = employee.getJobInformation();
        salaryInformation = employee.getSalaryInformation();
        fullName = employee.getName() + employee.getLastName();
        employeeCode = employeeNumber;
        address = employee.getAddress();
        baseSalary = salaryInformation.getBaseSalary();
        finalSalary = receipt.get(receipt.size() - 1).getFinalSalary();
        workTime = receipt.get(receipt.size() - 1).getWorkTime();
        overTimeWork = receipt.get(receipt.size() - 1).getOverWorkTime();
        addAmountForWorkSalary = String.valueOf(Integer.parseInt(receipt.get(receipt.size() - 1).getYearSalary()) - Integer.parseInt(salaryInformation.getBaseSalary()));
        employeeType = jobInformation.getEmployeeType();
    }

    DBHelper dbHelper;
    ArrayList<Receipt> receipt;
    Employee employee;
    JobInformation jobInformation;
    SalaryInformation salaryInformation;
    String fullName;
    String employeeCode;
    String address;
    String baseSalary;
    String finalSalary;
    String workTime;
    String overTimeWork;
    String addAmountForWorkSalary;
    String employeeType;


//    String fullName = employee.getName()+employee.getLastName();
//    String employeeCode = employeeNumber;
//    String address = employee.getAddress();
//    String baseSalary= salaryInformation.getBaseSalary();
//    String finalSalary = receipt.get(receipt.size()-1).getFinalSalary();
//    String workTime = receipt.get(receipt.size()-1).getWorkTime();
//    String overTimeWork = receipt.get(receipt.size()-1).getOverWorkTime();
//    String addAmountForWorkSalary = String.valueOf(Integer.parseInt(receipt.get(receipt.size()-1).getYearSalary())-Integer.parseInt(salaryInformation.getBaseSalary()));
//    String employeeType = jobInformation.getEmployeeType();

    public String getFullName() {
        return fullName;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getAddress() {
        return address;
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public String getFinalSalary() {
        return finalSalary;
    }

    public String getWorkTime() {
        return workTime;
    }

    public String getOverTimeWork() {
        return overTimeWork;
    }

    public String getAddAmountForWorkSalary() {
        return addAmountForWorkSalary;
    }

    public String getEmployeeType() {
        return employeeType;
    }
}
