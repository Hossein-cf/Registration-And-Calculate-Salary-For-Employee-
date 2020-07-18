package ServletsClasses;

import Extra.DBHelper;
import Extra.JobInformation;
import Extra.employeeTypes.EmployeeType;

import javax.jws.WebService;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/CompanyMembers")
public class CompanyMembers extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<JobInformation> list = new DBHelper().readJobInformation();
        int numberOfFulStack = 0;
        int numberOFFront = 0;
        int numberOFBack = 0;
        int numberOfBD = 0;
        int numberOFNetwork = 0;
        int all = 0;
        for (JobInformation information : list) {
            if (information.getEmployeeType().equals(EmployeeType.DBExpert.name()))
                numberOfBD++;
            else if (information.getEmployeeType().equals(EmployeeType.BackEnd.name())) {
                numberOFBack++;
            } else if (information.getEmployeeType().equals(EmployeeType.NetworkSecurityExpert.name())) {
                numberOFNetwork++;
            } else if (information.getEmployeeType().equals(EmployeeType.FullStack.name())) {
                numberOfFulStack++;
            } else if (information.getEmployeeType().equals(EmployeeType.FrontEnd.name())) {
                numberOFFront++;
            }
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("../web/MDashbordPages/CompanyMembersPage.jsp");
            all = numberOFBack + numberOfBD + numberOFFront + numberOfFulStack + numberOFNetwork;
            req.setAttribute("numberOFBack", numberOFBack);
            req.setAttribute("numberOfBD", numberOfBD);
            req.setAttribute("numberOFFront", numberOFFront);
            req.setAttribute("numberOfFulStack", numberOfFulStack);
            req.setAttribute("numberOFNetwork", numberOFNetwork);
            req.setAttribute("all", all);

            requestDispatcher.forward(req,resp);

        }
    }
}
