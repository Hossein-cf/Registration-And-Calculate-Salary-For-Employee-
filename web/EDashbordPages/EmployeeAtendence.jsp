<%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 7/16/2020
  Time: 12:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
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
    <link rel="stylesheet" href="../ManagerDashbordStyle/css/dashbordStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<section id="sideMenu" style="width: 275px">
    <nav>
        <a class="a-side" href="../EDashbordPages/EmployeeDashbord.jsp"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
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
            <span class="turquoise">You Can Submit your Attendance in This Page</span>
        </h1>
        <br>
        <p class="txt-style">
            Enter the Start Time and End Time of Working and Confirm it.
        </p>

    </div>
</section>

<section class="pane-1" style="margin-left: 300px">
    <%--    1--%>
        <div class="col-75">
            <div class="container">
                <form name="IssuanceReceipt" action="">

                    <div class="row">
                        <div class="issu" style="margin-left: 200px">


                            <div class="col-50">
                                <label for="overtimeStart">Enter Start Hour</label>
                                <input style="width: 100px" type="text" id="overtimeStart" name="overtimeStart" placeholder="just number">
                            </div>

                            <div class="col-50">
                                <label for="RqEnd">Enter End Hour</label>
                                <input style="width: 100px" type="text" id="RqEnd" name="RqEnd" placeholder="just number">
                            </div>




                        </div>

                    </div>

                    <input style="width: 200px;margin-left: 470px;margin-top: 50px" type="submit"
                           value="Confirm" class="btn" onclick=alert("Done")>

                </form>
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