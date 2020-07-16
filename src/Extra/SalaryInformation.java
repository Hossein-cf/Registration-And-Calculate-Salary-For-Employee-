package Extra;

public class SalaryInformation {
    private boolean afternoonWorking;
    private boolean morningWorking;
    private boolean nightWorking;
    private String baseSalary;

    public boolean isAfternoonWorking() {
        return afternoonWorking;
    }

    public void setAfternoonWorking(boolean afternoonWorking) {
        this.afternoonWorking = afternoonWorking;
    }

    public boolean isMorningWorking() {
        return morningWorking;
    }

    public void setMorningWorking(boolean morningWorking) {
        this.morningWorking = morningWorking;
    }

    public boolean isNightWorking() {
        return nightWorking;
    }

    public void setNightWorking(boolean nightWorking) {
        this.nightWorking = nightWorking;
    }

    public String getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(String baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "SalaryInformation{" +
                "afternoonWorking=" + afternoonWorking +
                ", morningWorking=" + morningWorking +
                ", nightWorking=" + nightWorking +
                ", baseSalary='" + baseSalary + '\'' +
                '}';
    }
}
