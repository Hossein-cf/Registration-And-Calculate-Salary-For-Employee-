package ServletsClasses;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/ManagerLoginServlet")
public class ManagerLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {





    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String user = req.getParameter("userName");
        String pass = req.getParameter("pass");
//        System.out.println(user+pass);
        if(user.equals("123456") && pass.equals("123456")) {

            RequestDispatcher view = req.getRequestDispatcher("ManagerDashbord.jsp");
            view.forward(req,resp);
            resp.sendRedirect("ManagerDashbord.jsp");
        }
        else {
            RequestDispatcher view = req.getRequestDispatcher("ManagerLoginJSP.jsp");
            view.forward(req,resp);
            resp.sendRedirect("ManagerLoginJSP.jsp");
        }

    }
}
