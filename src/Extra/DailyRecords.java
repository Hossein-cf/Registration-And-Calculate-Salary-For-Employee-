package Extra;

import java.time.LocalDate;

public class DailyRecords {
    private String workTime;
    private LocalDate enterTime;
    private LocalDate exitTime;
    private LocalDate StartOverWorkTime;
    private LocalDate endOverWorkTime;
    private String overworkTime;
    private String holidayWorkTime;


    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public LocalDate getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(LocalDate enterTime) {
        this.enterTime = enterTime;
    }

    public LocalDate getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDate exitTime) {
        this.exitTime = exitTime;
    }

    public LocalDate getStartOverWorkTime() {
        return StartOverWorkTime;
    }

    public void setStartOverWorkTime(LocalDate startOverWorkTime) {
        StartOverWorkTime = startOverWorkTime;
    }

    public LocalDate getEndOverWorkTime() {
        return endOverWorkTime;
    }

    public void setEndOverWorkTime(LocalDate endOverWorkTime) {
        this.endOverWorkTime = endOverWorkTime;
    }

    public String getOverworkTime() {
        return overworkTime;
    }

    public void setOverworkTime(String overworkTime) {
        this.overworkTime = overworkTime;
    }

    public String getHolidayWorkTime() {
        return holidayWorkTime;
    }

    public void setHolidayWorkTime(String holidayWorkTime) {
        this.holidayWorkTime = holidayWorkTime;
    }

    @Override
    public String toString() {
        return "DailyRecords{" +
                "workTime='" + workTime + '\'' +
                ", enterTime=" + enterTime +
                ", exitTime=" + exitTime +
                ", StartOverWorkTime=" + StartOverWorkTime +
                ", endOverWorkTime=" + endOverWorkTime +
                ", overworkTime='" + overworkTime + '\'' +
                ", holidayWorkTime='" + holidayWorkTime + '\'' +
                '}';
    }
}
