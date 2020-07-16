package Extra;

import java.util.ArrayList;

public class Employee extends Person{
    private JobInformation jobInformation;
    private String EmployeeNumber;
    private ArrayList<DailyRecords> records;
    private ArrayList<Receipt>  receipts;
    private SalaryInformation salaryInformation;

    public JobInformation getJobInformation() {
        return jobInformation;
    }

    public void setJobInformation(JobInformation jobInformation) {
        this.jobInformation = jobInformation;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public ArrayList<DailyRecords> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<DailyRecords> records) {
        this.records = records;
    }

    public ArrayList<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<Receipt> receipts) {
        this.receipts = receipts;
    }

    public SalaryInformation getSalaryInformation() {
        return salaryInformation;
    }

    public void setSalaryInformation(SalaryInformation salaryInformation) {
        this.salaryInformation = salaryInformation;
    }
}
