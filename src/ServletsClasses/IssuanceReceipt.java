package ServletsClasses;

import Extra.DBHelper;
import Extra.DailyRecords;
import Extra.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/IssuanceReceipt")
public class IssuanceReceipt extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeNumber = req.getParameter("employeeNumber");
        Employee employee = new DBHelper().readEmployee(employeeNumber);
       String workTime="0.0";
        String overWorkTime="0.0";
        if (employee != null) {
            ArrayList<Extra.DailyRecords> dailyRecords = new DBHelper().readDailyRecord(employeeNumber);
            if (dailyRecords.size() > 0) {
                for (DailyRecords dailyRecord : dailyRecords) {
                    workTime=calculateTime(workTime,dailyRecord.getWorkTime());
                    overWorkTime=calculateTime(overWorkTime,dailyRecord.getOverworkTime());
                }

            }

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


        int result = exitH + enterH;
        int minuteResult = exitM + enterM;
        if (minuteResult > 60) {
            result++;
            minuteResult -= 60;
        }

        return result + "." + minuteResult;

    }
}
