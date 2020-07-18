<%@ page import="Extra.GenerateEmployeeNumber" %><%--
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
    <link rel="stylesheet" href="../ManagerDashbordStyle/css/dashbordStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<section id="sideMenu" style="width: 275px">
    <nav>
        <a class="a-side" href="#"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord
        </a>

        <a class="a-side" href="../EDashbordPages/EmployeeSalaryReceipt.jsp"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
            Salary Receipt
        </a>

        <a class="a-side" href="../EDashbordPages/EmployeeAtendence.jsp"><i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
            Attendance
        </a>

    </nav>
</section>

<header>
    <div class="search-area">


        <div class="topnav">
            <a class="active" href="#home">Home</a>
            <a href="#news">Help</a>
            <a href="#contact">Contact</a>
            <a href="#about">About</a>
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

            <div class="inline-row-1">
                <div class="flip-card" style="width: 400px;height: 300px;">
                    <div class="flip-card-inner">
                        <div class="flip-card-front">
                            <img src="../ManagerDashbordStyle/pics/Work.png" alt="Avatar"
                                 style="width:400px;height:300px;">
                        </div>
                        <div class="flip-card-back">
                            <h1>Your Job in Company</h1>
                            <p>---</p>
                            <h1>Your Work Time</h1>
                            <p>---</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="inline-row-1" style="width: 600px;">
                <div class="ED-pane">



                </div>

            </div>



        </div>


</section>

<section class="pane-1">
    <%--    2--%>



</section>


<section class="pane-1">
    <%--    3--%>



</section>


<section>

</section>


</body>
</html>