package ServletsClasses;

import Extra.DBHelper;
import Extra.Employee;
import Extra.employeeTypes.DBExpert;
import Extra.employeeTypes.DB_Expert;
import Extra.employeeTypes.EmployeeType;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/EmploymentPage")
public class EmploymentPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Employee employee = new Employee();
        employee.setName(req.getParameter("firstName"));
        employee.setLastName(req.getParameter("lastName"));
        employee.setFatherName(req.getParameter("FatherName"));
        employee.setNationalNumber(Long.parseLong(req.getParameter("NationalCode")));
        req.getParameterValues("Gender");
        req.getParameter("PostalCode");
        req.getParameter("PhoneNumber");
        req.getParameter("Address");
        req.getParameter("HomePhoneNumber");
        req.getParameter("marital status");
        req.getParameter("Age");
        req.getParameter("Born");
        req.getParameter("Address");
        req.getParameter("number of children");


        req.getParameter("ELevelOfEducation");
        req.getParameter("WorkTime");
        req.getParameter("ELevel");
        String git =req.getParameter("Git");

         String telle_working=req.getParameter("Telle Working");
        String mac_Linux =req.getParameter("Mac/Linux");
        String EmployeeTypeIndex = req.getParameter("EType");
        int Score = getScore(req, Integer.parseInt(EmployeeTypeIndex));
        System.out.println(Score+"llllllll");
        resp.sendRedirect("../web/MDashbordPages/EmploymentPage.jsp");
    }

    private int getScore(HttpServletRequest req, int EmployeeType) {
        int Score = 0;

        if (EmployeeType == Extra.employeeTypes.EmployeeType.DBExpert.getValue()) {
            String values[] = new String[8];
            for (int i = 0; i < 8; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"DataBaseImplementationAndDesign", "Bottleneck", "BackupAndRecovery", "SQL", "Replication", "dataBaseAdministration", "backUpAndRecovery", "clustering"};

            for (int i = 0; i < 8; i++) {
                if (values[i] != null)
                    Score += DB_Expert.valueOf(skills[i]).value;
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.BackEnd.getValue()) {
            String values[] = new String[11];
            for (int i = 0; i < 11; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"python", "ruby", "node_JS", "PHP7", "ASP_NET", "webServer", "SQLServer", "OracleDatabase", "RestfulAPIs", "Security", "Docker"};
            for (int i = 0; i < 11; i++) {
                if (values[i]!= null)
                    Score += DB_Expert.valueOf(skills[i]).value;
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.FrontEnd.getValue()) {
            String values[] = new String[19];
            for (int i = 0; i < 19; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"CSS", "JS", "XHTR", "HTMLDOM", "JAVAScript", "ReactJs", "Angular", "VueJs", "jQuery", "TypeScript", "ES6", "yarn", "npm", "CSSResponsive", "json", "ajax", "materialDesign", "bootStrap", "W3Css"};
            for (int i = 0; i < 19; i++) {
                if (values[i]!= null)
                    Score += DB_Expert.valueOf(skills[i]).value;
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.FullStack.getValue()) {
            String values[] = new String[16];
            for (int i = 0; i < 16; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"CSS", "JS", "reactJs", "jQuery", "mobilePrograming", "python", "ruby", "nodeJs", "PHP7", "ASP_NET", "webServer", "SQLServer", "oracleDatabase", "xamarin", "security", "docker"};
            for (int i = 0; i < 16; i++) {
                if (values[i]!= null)
                    Score += DB_Expert.valueOf(skills[i]).value;
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.NetworkSecurityExpert.getValue()) {
            String values[] = new String[9];
            for (int i = 0; i < 9; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"UTM", "ISMS", "PLC", "CEH", "CISSP", "CCNA", "QOD", "HAIPE_IP", "MPLS"};
            for (int i = 0; i < 9; i++) {
                if (values[i]!= null)
                    Score += DB_Expert.valueOf(skills[i]).value;
            }
        }
        return Score;
    }
}
