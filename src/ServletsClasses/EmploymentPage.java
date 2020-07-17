package ServletsClasses;

import Extra.Employee;

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
        req.getParameter("WorkTime");
        req.getParameter("ELevel");
        req.getParameter("EType");
        req.getParameter("Gender");
        req.getParameter("ELevelOfEducation");
        req.getParameter("PostalCode");
        req.getParameter("PhoneNumber");
        req.getParameter("Address");
        req.getParameter("EType");
        req.getParameter("EType");
    }
}
