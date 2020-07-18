<%@ page import="Extra.GenerateEmployeeNumber" %>
<%@ page import="ServletsClasses.EmployeeDashboardGetData" %><%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 7/16/2020
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>ManagerDashbord</title>
    <link rel="stylesheet" href="./ManagerDashbordStyle/css/dashbordStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<section id="sideMenu" style="width: 275px">
    <nav>
        <a class="a-side" href="#"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord
        </a>

        <form method="post" action="EmployeeSalaryReceipt.jsp">
            <%out.println("<input type=\"hidden\" name=\"id\" value=\"9819236994\">");%>
            <button type="submit">
            <a class="a-side" href="EmployeeSalaryReceipt.jsp"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
            Salary Receipt
        </a></button></form>

        <a class="a-side" href="EmployeeAtendence.jsp"><i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
            Attendance
        </a>

    </nav>
</section>

<header>
    <div class="search-area">
        <div class="topnav">
            <a class="active" href="../index.html">Home</a>
            <a href="#news">Help</a>
            <a href="#contact">Contact</a>
            <a href="../EmployeeloginJSP.jsp">Log out</a>
        </div>
    </div>
</header>
<section class="content-area">
    <div class="heading">
        <h1>
            <span class="turquoise">Welcome to Your Dashbord</span>
        </h1>
        <br>
        <p class="txt-style">

        </p>

    </div>
</section>

<section class="pane-1">
    <%--    1--%>
        <div class="row-in-pane">
            <div class="inline-row-1" style="width: 600px;">
                <div class="ED-pane">
                    <h1>
                        <%
                        String employeeNumber = (String) request.getAttribute("employeeNumber");
                        employeeNumber = "9819236994";//todo
                            EmployeeDashboardGetData data =null;
                            if (employeeNumber != null) {
                                data = new EmployeeDashboardGetData(employeeNumber);
                            }
                        %>
                        Employee Info:
                        <br>
                        <br>
                        <br>
                            Full Name:
                        <input id="FullName" type="text" value="<%if (data!=null)out.print(data.getFullName());%>">
                        <br>
                            Employee Code:
                        <input id="EmployeeCode" type="text" value="<%if (data!=null)out.print(data.getEmployeeCode());%>">
                        <br>
                            National Code:
                        <input id="NationalCode" type="text" value="<%if (data!=null)out.print(data.getNationalCode());%>">
                            <br>
                            Base Salary:
                        <input id="" type="text"value="<%if (data!=null)out.print(data.getBaseSalary());%>">
                    </h1>
                </div>
            </div>
<%--                        <div class="inline-row-1" style="display: inline-block">--%>
<%--                            <div class="flip-card" style="width: 400px;height: 300px;">--%>
<%--                                <div class="flip-card-inner">--%>
<%--                                    <div class="flip-card-front">--%>
<%--                                        <img src="../ManagerDashbordStyle/pics/Work.png" alt="Avatar"--%>
<%--                                             style="width:400px;height:300px;">--%>
<%--                                    </div>--%>
<%--                                    <div class="flip-card-back">--%>
<%--                                        <h1>Your Job in Company</h1>--%>
<%--                                        <p>---</p>--%>
<%--                                        <h1>Your Work Time</h1>--%>
<%--                                        <p>---</p>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>


        </div>


</section>




<section>

</section>


</body>
</html>