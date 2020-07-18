package ServletsClasses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectEDashSalary extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("./EDashbordPages/EmployeeSalaryReceipt.jsp");
        String id = (String) req.getAttribute("id");
        if(id==null)
            id= req.getParameter("id");
        System.out.println("RedirectEDashSalary.doGet");
        System.out.println("id = " + id);
        dispatcher.forward(req, resp);



    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("./EDashbordPages/EmployeeSalaryReceipt.jsp");
        String id = (String) req.getAttribute("id");
        if(id==null)
            id= req.getParameter("id");
        System.out.println("RedirectEDashSalary.doPost");
        System.out.println("id = " + id);
        dispatcher.forward(req, resp);



    }
}
