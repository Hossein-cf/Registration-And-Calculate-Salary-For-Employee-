package ServletsClasses;

import Extra.DBHelper;
import Extra.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DailyRecords")
public class DailyRecords extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Employee employee = new DBHelper().readEmployee(req.getParameter("employeeNumber"));
        Extra.DailyRecords dailyRecords = new Extra.DailyRecords();

        if (employee != null) {
            req.setAttribute("employee", employee);
            String employeeNumber = req.getParameter("employeeNumber");
            dailyRecords.setEnterTime("RqStart");
            dailyRecords.setExitTime("RqEnd");
            dailyRecords.setStartOverWorkTime("overtimeStart");
            dailyRecords.setEndOverWorkTime("overtimeEnd");
            dailyRecords.setWorkTime(calculateTime(dailyRecords.getEnterTime(), dailyRecords.getExitTime()));
            dailyRecords.setOverworkTime(calculateTime(dailyRecords.getStartOverWorkTime(), dailyRecords.getEndOverWorkTime()));
            new DBHelper().insertDailyRecord(dailyRecords,employeeNumber);
        }

    }

    private String calculateTime(String enter, String exit) {
        String[] enters = enter.split(".");
        String[] exits = exit.split(".");

        String enterHour = enters[0];
        String enterMinute = enters[1];
        String exitHour = exits[0];

        String exitMinute = exits[1];
        int enterH = Integer.parseInt(enterHour);
        int exitH = Integer.parseInt(exitHour);
        int enterM = Integer.parseInt(enterMinute);
        int exitM = Integer.parseInt(exitMinute);


        int result = exitH - enterH;
        int minuteResult = exitM - enterM;
        if (minuteResult < 0) {
            result--;
            minuteResult += 60;
        }

        return result + "." + minuteResult;

    }
}
