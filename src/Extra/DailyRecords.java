package Extra;

import java.time.LocalDate;

public class DailyRecords {
    private String workTime="0.0";
    private String enterTime;
    private String exitTime;
    private String StartOverWorkTime;
    private String endOverWorkTime;
    private String overworkTime="0.0";
    private String holidayWorkTime;

    public String getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(String enterTime) {
        this.enterTime = enterTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    public String getStartOverWorkTime() {
        return StartOverWorkTime;
    }

    public void setStartOverWorkTime(String startOverWorkTime) {
        StartOverWorkTime = startOverWorkTime;
    }

    public String getEndOverWorkTime() {
        return endOverWorkTime;
    }

    public void setEndOverWorkTime(String endOverWorkTime) {
        this.endOverWorkTime = endOverWorkTime;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
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
