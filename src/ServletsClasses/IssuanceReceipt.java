package ServletsClasses;

import Extra.*;
import Extra.DailyRecords;
import Extra.employeeTypes.DBExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/IssuanceReceipt")
public class IssuanceReceipt extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String employeeNumber = req.getParameter("employeeNumber");
        Employee employee = new DBHelper().readEmployee(employeeNumber);
        Person person = employee;
        String workTime = "0.0";
        String overWorkTime = "0.0";
        if (employee != null) {
            ArrayList<Extra.DailyRecords> dailyRecords = new DBHelper().readDailyRecord(employeeNumber);
            if (dailyRecords.size() > 0) {
                for (DailyRecords dailyRecord : dailyRecords) {
                    workTime = calculateTime(workTime, dailyRecord.getWorkTime());
                    overWorkTime = calculateTime(overWorkTime, dailyRecord.getOverworkTime());
                }

                req.setAttribute("personalInfo", person.toString());
                req.setAttribute("overTime", overWorkTime);
                req.setAttribute("jobInfo", employee.getJobInformation().toString());
                Receipt receipt = new Receipt();
                receipt.setDeductedAmount("0");
                receipt.setPremium("0");
                receipt.setOverWorkTime(overWorkTime);
                receipt.setWorkTime(workTime);
                receipt.setCondition(true);

                receipt.setRightToHousing("0");


                DBExpert dbExpert = new DBExpert();
                double a = 0;
                receipt.setInsurance(""+dbExpert.calculateInsurance(dbExpert.calculatePrimarySalary(Double.parseDouble(overWorkTime), 0, 0, 4, Double.parseDouble(employee.getSalaryInformation().getBaseSalary()), 0)));
                receipt.setTax(dbExpert.calculateMoneyForTax(dbExpert.calculatePrimarySalary(Double.parseDouble(overWorkTime), 0, 0, 4, Double.parseDouble(employee.getSalaryInformation().getBaseSalary()), 0)) + "");
                receipt.setYearSalary("" + dbExpert.calculateYears(4, Double.parseDouble(employee.getSalaryInformation().getBaseSalary())));
                receipt.setFinalSalary(dbExpert.calculateFinalSalary(Double.parseDouble(overWorkTime), a, a, 4, Double.parseDouble(employee.getSalaryInformation().getBaseSalary()), a, a, a, a) + "");
                DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
                Date date = new Date();
                receipt.setDate(dateFormat.format(date));
                receipt.setSerial(Long.parseLong(new CreateSerialForReceipt().generateSerial()));

                new DBHelper().insertReceipt(receipt,employeeNumber);
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("../web/MDashbordPages/Receipt.jsp");
                req.setAttribute("employee",employee);
                req.setAttribute("receipt",receipt);
                requestDispatcher.forward(req, resp);

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
