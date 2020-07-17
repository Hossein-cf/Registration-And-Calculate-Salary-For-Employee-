package Extra.employeeTypes;

import Extra.*;

import java.util.ArrayList;

public class EmployeeSalaryReceiptGetData {
    String employeeNumber="1" ;
    DBHelper dbHelper = new DBHelper();
    ArrayList<Receipt> receipt = dbHelper.readReceipt(employeeNumber);
    Employee employee = dbHelper.readEmployee(employeeNumber);
    JobInformation jobInformation = employee.getJobInformation();
    SalaryInformation salaryInformation = employee.getSalaryInformation();
    String fullName = employee.getName()+employee.getLastName();
    String employeeCode = employeeNumber;
    String address = employee.getAddress();
    String baseSalary= salaryInformation.getBaseSalary();
    String finalSalary = receipt.get(receipt.size()-1).getFinalSalary();
    String workTime = receipt.get(receipt.size()-1).getWorkTime();
    String overTimeWork = receipt.get(receipt.size()-1).getOverWorkTime();
    String addAmountForWorkSalary = String.valueOf(Integer.parseInt(receipt.get(receipt.size()-1).getYearSalary())-Integer.parseInt(salaryInformation.getBaseSalary()));
    String employeeType = jobInformation.getEmployeeType();

}
