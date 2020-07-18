package ServletsClasses;

import Extra.*;

import java.util.ArrayList;

public class EmployeeSalaryReceiptGetDataTest {
    public EmployeeSalaryReceiptGetDataTest(String employeeNumber) {
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
        if (receipt.size()>0) {
            finalSalary = receipt.get(receipt.size() - 1).getFinalSalary();
            workTime = receipt.get(receipt.size() - 1).getWorkTime();
            overTimeWork = receipt.get(receipt.size() - 1).getOverWorkTime();
            addAmountForWorkSalary = String.valueOf(Integer.parseInt(receipt.get(receipt.size() - 1).getYearSalary()) - Integer.parseInt(salaryInformation.getBaseSalary()));
        }
        else{
            finalSalary = receipt.get(receipt.size()).getFinalSalary();
        workTime = receipt.get(receipt.size()).getWorkTime();
        overTimeWork = receipt.get(receipt.size()).getOverWorkTime();
        addAmountForWorkSalary = String.valueOf(Integer.parseInt(receipt.get(receipt.size()).getYearSalary()) - Integer.parseInt(salaryInformation.getBaseSalary()));
    }
    employeeType = jobInformation.getEmployeeType();
    }

    public static void main(String[] args) {
        EmployeeSalaryReceiptGetDataTest employeeSalaryReceiptGetData = new EmployeeSalaryReceiptGetDataTest("9819236994");
        System.out.println(employeeSalaryReceiptGetData.toString());
    }

    @Override
    public String toString() {
        return "EmployeeSalaryReceiptGetDataTest{" +
                "fullName='" + fullName + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", address='" + address + '\'' +
                ", baseSalary='" + baseSalary + '\'' +
                ", finalSalary='" + finalSalary + '\'' +
                ", workTime='" + workTime + '\'' +
                ", overTimeWork='" + overTimeWork + '\'' +
                ", addAmountForWorkSalary='" + addAmountForWorkSalary + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
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

//
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
