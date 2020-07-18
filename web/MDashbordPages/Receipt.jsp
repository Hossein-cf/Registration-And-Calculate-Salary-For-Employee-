<%@ page import="java.util.Date" %>
<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="Extra.Employee" %>
<%@ page import="Extra.Receipt" %><%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 7/3/2020
  Time: 1:01 AM
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
<section id="sideMenu">
    <nav>
        <a class="a-side" href="ManagerDashbord.jsp"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord</a>
        <a class="a-side" href="EmploymentPage.jsp"><i class="fa fa-briefcase fa-2x"
                                                                      aria-hidden="true"></i>
            Employment</a>
        <a class="a-side" href="IssuanceReceiptPage.jsp"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
            Issuance Receipt</a>
        <a class="a-side" href="DailyRecordsPage.jsp"> <i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
            Daily Records</a>
        <a class="a-side" href="CompanyMembersPage.jsp"> <i class="fa fa-building fa-2x"
                                                                           aria-hidden="true"></i>
            Company Members</a>
    </nav>
</section>

<header>
    <div class="search-area">
            <div class="topnav">
                <a class="active" href="../index.html">Home</a>
                <a href="#">Help</a>
                <a href="#">Contact</a>
                <a href="../ManagerLoginJSP.jsp">Log out</a>
            </div>
    </div>
</header>
<section class="content-area">
    <div class="heading">
        <h1>
            <span class="turquoise">This is Employee Salary Receipt after a month  </span>
        </h1>
        <br>
        <p class="txt-style">
           your Final Salary Calculated based on Employee Over time , vacation hours and ...
        </p>

    </div>
</section>

<section class="pane-1-Receipt">
<%
    Employee employee = (Employee) request.getAttribute("employee");
    Receipt receipt = (Receipt) request.getAttribute("receipt");
%>

    <div class="row">
        <div class="col-75">
            <div class="container">
                <form action="${pageContext.request.contextPath}/CreateReceipt" method="post" >

                    <div class="row">
                        <div class="col-50">
                            <h3>Your Last receipt</h3>
                            <label for="fname"> Full Name</label>
                            <input type="text" id="fname" name="firstname" value="<% out.print(employee.getName());  %>" placeholder="">
                            <label for="email"> Employee Code</label>
                            <input type="text" id="email" name="email" placeholder="">
                            <label for="adr"> Address</label>
                            <input type="text" id="adr" name="address" value="<% out.print(employee.getAddress());%>" placeholder="">
                            <label for="city"> Woking Time</label>
                            <input type="text" id="city" name="city"value="<%out.print(receipt.getWorkTime());%>" placeholder="">

                            <div class="row">
                                <div class="col-50">
                                    <label for="job">Job in Company</label>
                                    <input type="text" id="job" name="job" placeholder="">
                                </div>
                                <div class="col-50">
                                    <label for="level">Employee Level</label>
                                    <input type="text" id="level" name="level" value="<%out.print(employee.getEmployeeLevel());%>" placeholder="">
                                </div>
                            </div>
                        </div>

                        <div class="col-50">
                            <h3 id="time">


                            </h3>


                            <label for="baseSalary">Base Salary</label>
                            <input type="text" id="baseSalary" name="baseSalary" value="<%out.print(employee.getSalaryInformation().getBaseSalary());%>" placeholder="">
                            <label for="overtime">amount of over time</label>
                            <input type="text" id="overtime" name="overtime" value="<%out.print(receipt.getOverWorkTime());%>" placeholder="">
                            <label for="deducted"> deducted amount</label>
                            <input type="text" id="deducted" name="deducted" value="<%out.print(0);%>" placeholder="">
                            <label for="deducted"> deducted amount</label>
                            <input type="text" id="deducted1" name="deducted" value="<%%>" placeholder="">

                            <div class="row" style="margin-top: 20px">
                                <div class="col-50">
                                    <label for="experience">Added amount for work experience</label>
                                    <input type="text" id="experience" name="experience" value="<%%>" placeholder="">
                                </div>
                                <div class="col-50">
                                    <label for="FinalSalary">Final Salary</label>
                                    <input type="text" id="FinalSalary" name="FinalSalary" value="<%receipt.getFinalSalary();%>" placeholder="">
                                </div>
                            </div>
                        </div>

                    </div>

<%--                    <input type="submit" value="Continue to checkout" class="btn">--%>
                </form>
            </div>
        </div>

<%--        <div class="col-25">--%>
<%--            <div class="container">--%>
<%--                <h4>Cart--%>
<%--                    <span class="price" style="color:black">--%>
<%--          <i class="fa fa-shopping-cart"></i>--%>
<%--          <b>4</b>--%>
<%--        </span>--%>
<%--                </h4>--%>
<%--                <p><a href="#">Product 1</a> <span class="price">$15</span></p>--%>
<%--                <p><a href="#">Product 2</a> <span class="price">$5</span></p>--%>
<%--                <p><a href="#">Product 3</a> <span class="price">$8</span></p>--%>
<%--                <p><a href="#">Product 4</a> <span class="price">$2</span></p>--%>
<%--                <hr>--%>
<%--                <p>Total <span class="price" style="color:black"><b>$30</b></span></p>--%>
<%--            </div>--%>
<%--        </div>--%>
    </div>



</section>


<section>
    <div class="cards">

        <div class="card-1">

            <div class="See-charts">
                <span class="Developing">  </span>
            </div>
        </div>

    </div>
</section>

<script>
    var today = new Date();

    var time = today.getHours() + ":" + today.getMinutes() ;
    var date = today.getFullYear()+'-'+(today.getMonth()+1)+'-'+today.getDate();


    document.getElementById("time").innerHTML = date +"  /  "+ time;
</script>


</body>
</html>
