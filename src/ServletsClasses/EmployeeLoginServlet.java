package ServletsClasses;

import Extra.DBHelper;
import Extra.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.IllegalStateException;

@WebServlet("/EmployeeLoginServlet")
public class EmployeeLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, IllegalStateException {
        String userName = req.getParameter("userName");
        String pass = req.getParameter("pass");
        DBHelper dbHelper = new DBHelper();
        Employee employee = dbHelper.readEmployee(userName);
        if (employee != null){
            if (pass.equals(employee.getNationalNumber()+"")){
                RequestDispatcher dispatcher = req.getRequestDispatcher("./EDashbordPages/EmployeeDashbord.jsp");
                req.setAttribute("id",userName);
                dispatcher.forward(req, resp);

            }else {
                resp.getWriter().print("User Name or Pass is incorrect ");
            }
        }else {
            resp.getWriter().print("User Name or Pass is incorrect ");

        }

    }

}
