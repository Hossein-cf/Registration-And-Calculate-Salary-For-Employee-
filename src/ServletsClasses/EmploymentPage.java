package ServletsClasses;

import Extra.*;
import Extra.employeeTypes.*;
import com.sun.deploy.net.HttpRequest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/EmploymentPage")
public class EmploymentPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Employee employee = new Employee();
//        employee.setEmployeeNumber(String.valueOf(req.getAttribute("EmployeeNumber")));
        employee.setName(req.getParameter("firstName"));
        employee.setLastName(req.getParameter("lastName"));
        employee.setFatherName(req.getParameter("FatherName"));
        employee.setNationalNumber(Long.parseLong(req.getParameter("NationalCode")));
        System.out.println();
        if (req.getParameter("Gender").equals("1"))
            employee.setGender(Gender.Male.name());
        else employee.setGender(Gender.Female.name());
        employee.setPostalCode(req.getParameter("PostalCode"));
        employee.setPhoneNumber(req.getParameter("PhoneNumber"));
        employee.setAddress(req.getParameter("Address"));
        employee.setHomePhoneNumber(req.getParameter("HomePhoneNumber"));
        if (req.getParameter("marital status").equals("1"))
            employee.setMarriage(true);
        else
            employee.setMarriage(false);
        employee.setBirthTime(req.getParameter("Age"));

        employee.setBirthPlace(req.getParameter("Born"));
        employee.setNumberOfChild(Integer.parseInt(req.getParameter("number of children")));

//

        if (req.getParameter("ELevel").equals("2"))
            employee.setEmployeeLevel(EmployeeLevel.Mid_level.name());
        else if (req.getParameter("ELevel").equals("1"))
            employee.setEmployeeLevel(EmployeeLevel.Junior.name());
        else
            employee.setEmployeeLevel(EmployeeLevel.Senior.name());


        JobInformation jobInformation = new JobInformation();
        SalaryInformation salaryInformation = new SalaryInformation();
        if (req.getParameter("WorkTime").equals("2"))
            salaryInformation.setMorningWorking(true);
        else if (req.getParameter("WorkTime").equals("3"))
            salaryInformation.setAfternoonWorking(true);
        else if (req.getParameter("WorkTime").equals("4"))
            salaryInformation.setNightWorking(true);
        else
            salaryInformation.setFullTimeWorking(true);
        if (req.getParameter("ELevelOfEducation").equals("1"))
            jobInformation.setCertification(ELevelOfEducation.Diploma.name());
        else if (req.getParameter("ELevelOfEducation").equals("2"))
            jobInformation.setCertification(ELevelOfEducation.Bachelor.name());
        else
            jobInformation.setCertification(ELevelOfEducation.MA.name());

        String git = req.getParameter("Git");

        String telle_working = req.getParameter("Telle Working");
        String mac_Linux = req.getParameter("Mac/Linux");


        String EmployeeTypeIndex = req.getParameter("EType");
        int Score = getScore(req, Integer.parseInt(EmployeeTypeIndex));
        System.out.println(Score + "llllllll");
        if (git != null)
            Score++;
        if (telle_working != null)
            Score++;
        if (mac_Linux != null)
            ++Score;
        if (EmployeeTypeIndex.equals("1")) {
            jobInformation.setEmployeeType(EmployeeType.DBExpert.name());
            salaryInformation.setBaseSalary(String.valueOf(new DBExpert().calculateBaseSalary(Score, employee.getEmployeeLevel(), "")));
        } else if (EmployeeTypeIndex.equals("2")) {
            jobInformation.setEmployeeType(EmployeeType.NetworkSecurityExpert.name());
            salaryInformation.setBaseSalary(String.valueOf(new NetworkSecurityExpert().calculateBaseSalary(Score, employee.getEmployeeLevel(), "")));

        } else if (EmployeeTypeIndex.equals("3")) {
            jobInformation.setEmployeeType(EmployeeType.FullStack.name());
            salaryInformation.setBaseSalary(String.valueOf(new FullStack().calculateBaseSalary(Score, employee.getEmployeeLevel(), "")));

        } else if (EmployeeTypeIndex.equals("4")) {
            jobInformation.setEmployeeType(EmployeeType.FrontEnd.name());
            salaryInformation.setBaseSalary(String.valueOf(new FrontEnd().calculateBaseSalary(Score, employee.getEmployeeLevel(), "")));

        } else if (EmployeeTypeIndex.equals("5")) {
            jobInformation.setEmployeeType(EmployeeType.BackEnd.name());
            salaryInformation.setBaseSalary(String.valueOf(new BackEnd().calculateBaseSalary(Score, employee.getEmployeeLevel(), "")));

        }
        jobInformation.setSkills("full");
        employee.setJobInformation(jobInformation);
        employee.setSalaryInformation(salaryInformation);
        String number = GenerateEmployeeNumber.generateNumber();

        employee.setEmployeeNumber(number);

        new DBHelper().insertEmployee(employee);
        PrintWriter out = resp.getWriter();
        out.print("Employee Number :" + number);
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("../src/ServletsClasses/EmploymentPage.java");
//        request.setAttribute("EmployeeNumber",number);
//        requestDispatcher.forward(request,response);

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
                if (values[i] != null)
                    Score += Back_End.valueOf(skills[i]).getValue();
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.FrontEnd.getValue()) {
            String values[] = new String[19];
            for (int i = 0; i < 19; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"CSS", "JS", "XHTR", "HTMLDOM", "JAVAScript", "ReactJs", "Angular", "VueJs", "jQuery", "TypeScript", "ES6", "yarn", "npm", "CSSResponsive", "json", "ajax", "materialDesign", "bootStrap", "W3Css"};
            for (int i = 0; i < 19; i++) {
                if (values[i] != null)
                    Score += Front_End.valueOf(skills[i]).getValue();
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.FullStack.getValue()) {
            String values[] = new String[16];
            for (int i = 0; i < 16; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"CSS", "JS", "reactJs", "jQuery", "mobilePrograming", "python", "ruby", "nodeJs", "PHP7", "ASP_NET", "webServer", "SQLServer", "oracleDatabase", "xamarin", "security", "docker"};
            for (int i = 0; i < 16; i++) {
                if (values[i] != null)
                    Score += Full_Stack.valueOf(skills[i]).getValue();
            }
        } else if (EmployeeType == Extra.employeeTypes.EmployeeType.NetworkSecurityExpert.getValue()) {
            String values[] = new String[9];
            for (int i = 0; i < 9; i++) {
                values[i] = req.getParameter("chek" + i);
            }
            String[] skills = {"UTM", "ISMS", "PLC", "CEH", "CISSP", "CCNA", "QOD", "HAIPE_IP", "MPLS"};
            for (int i = 0; i < 9; i++) {
                if (values[i] != null)
                    Score += Network_Security.valueOf(skills[i]).value;
            }
        }
        return Score;
    }
}
