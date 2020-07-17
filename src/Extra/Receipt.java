package Extra;

import java.time.LocalDate;

public class Receipt {

    private String finalSalary;
    private String rightToHousing;
    private String tax;
    private String insurance;
    private String workTime;
    private String overWorkTime;
    private String Premium;
    private LocalDate date;
    private boolean condition;
    private long serial;
    private  String yearSalary;
    private String deductedAmount ;

    public String getDeductedAmount() {
        return deductedAmount;
    }

    public void setDeductedAmount(String deductedAmount) {
        this.deductedAmount = deductedAmount;
    }


    public String getYearSalary() {
        return yearSalary;
    }

    public void setYearSalary(String yearSalary) {
        this.yearSalary = yearSalary;
    }



    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(String finalSalary) {
        this.finalSalary = finalSalary;
    }

    public String getRightToHousing() {
        return rightToHousing;
    }

    public void setRightToHousing(String rightToHousing) {
        this.rightToHousing = rightToHousing;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getOverWorkTime() {
        return overWorkTime;
    }

    public void setOverWorkTime(String overWorkTime) {
        this.overWorkTime = overWorkTime;
    }

    public String getPremium() {
        return Premium;
    }

    public void setPremium(String premium) {
        Premium = premium;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "finalSalary='" + finalSalary + '\'' +
                ", rightToHousing='" + rightToHousing + '\'' +
                ", tax='" + tax + '\'' +
                ", insurance='" + insurance + '\'' +
                ", workTime='" + workTime + '\'' +
                ", overWorkTime='" + overWorkTime + '\'' +
                ", Premium='" + Premium + '\'' +
                ", date=" + date +
                ", condition=" + condition +'\'' +
                ", deductedAmount=" + deductedAmount +'\'' +
                ", yearSalary=" + yearSalary +
                '}';
    }

}
