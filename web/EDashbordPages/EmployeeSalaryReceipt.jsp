<%@ page import="ServletsClasses.EmployeeSalaryReceiptGetData" %><%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 7/16/2020
  Time: 12:26 AM
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
        <a class="a-side" href="EmployeeDashbord.jsp"><i class="fa fa-tachometer fa-2x"
                                                                           aria-hidden="true"></i>
            DashBord
        </a>

        <a class="a-side" href="#"><i class="fa fa-list-alt fa-2x"
                                                                                aria-hidden="true"></i>
            Salary Receipt
        </a>

        <a class="a-side" href="EmployeeAtendence.jsp"><i class="fa fa-check-square-o fa-2x"
                                                                            aria-hidden="true"></i>
            Attendance
        </a>

    </nav>
</section>

<header>
    <div class="search-area">

        <%--        <input id="search-input" type="text" name="" value="">--%>
        <%--    </div>--%>
        <%--    <div class="user-area">--%>
        <%--        <a class="a-header" href="#"></a>--%>
        <%--        <a class="a-header" href="#"><span></span></a>--%>
        <%--        <a class="a-header" href="#">--%>
        <%--            <div class="user-image"></div>--%>

        <%--        </a>--%>
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
            <span class="turquoise">This is Employee Salary Receipt after a month  </span>
        </h1>
        <br>
        <p class="txt-style">
            your Final Salary Calculated based on Employee Over time , vacation hours and ...
        </p>

    </div>
</section>

<section class="pane-1-Receipt">


    <div class="row">
        <div class="col-75">
            <div class="container">
                <form action="">

                    <%EmployeeSalaryReceiptGetData data = new EmployeeSalaryReceiptGetData();%>

                    <div class="row">
                        <div class="col-50">
                            <h3>Your Last receipt</h3>
                            <label for="fname"> Full Name</label>
                            <input type="text" id="fname" name="firstname" placeholder="" value="<%out.print(data.getFullName());%>">
                            <label for="email"> Employee Code</label>

                            <input type="text" id="email" name="email" placeholder="" value="<%out.print(data.getEmployeeCode());%>">
                            <label for="adr"> Address</label>
                            <input type="text" id="adr" name="address" placeholder="" value="<%out.print(data.getAddress());%>">
                            <label for="city"> Woking Time</label>
                            <input type="text" id="city" name="city" placeholder="" value="<%out.print(data.getWorkTime());%>">

                            <div class="row">
                                <div class="col-50">
                                    <label for="job">Job in Company</label>
                                    <input type="text" id="job" name="job" placeholder="" value="<%out.print("job");%>">//todo
                                </div>
                                <div class="col-50">
                                    <label for="level">Employee Level</label>
                                    <input type="text" id="level" name="level" placeholder="" value="<%out.print("Level");%>">//todo
                                </div>
                            </div>
                        </div>

                        <div class="col-50">
                            <h3 id="time">
                                <%out.print("Time");%>//todo

                            </h3>


                            <label for="baseSalary">Base Salary</label>
                            <input type="text" id="baseSalary" name="baseSalary" placeholder="" value="<%out.print(data.getBaseSalary());%>">
                            <label for="overtime">amount of over time</label>
                            <input type="text" id="overtime" name="overtime" placeholder="" value="<%out.print("amount of overtime Work");%>">//todo
                            <label for="deducted"> deducted amount</label>
                            <input type="text" id="deducted" name="deducted" placeholder="" value="<%out.print("deducted amount");%>">//todo
                            <label for="deducted"> deducted amount</label>
                            <input type="text" id="deducted1" name="deducted" placeholder="" value="<%out.print("deducated amount");%>">//todo

                            <div class="row" style="margin-top: 20px">
                                <div class="col-50">
                                    <label for="experience">Added amount for work experience</label>
                                    <input type="text" id="experience" name="experience" placeholder="" value="<%out.print(data.getAddAmountForWorkSalary());%>">
                                </div>
                                <div class="col-50">
                                    <label for="FinalSalary">Final Salary</label>
                                    <input type="text" id="FinalSalary" name="FinalSalary" placeholder="" value="<%out.print(data.getFinalSalary());%>">
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

    var time = today.getHours() + ":" + today.getMinutes();
    var date = today.getFullYear() + '-' + (today.getMonth() + 1) + '-' + today.getDate();


    document.getElementById("time").innerHTML = date + "  /  " + time;
</script>


</body>
</html>
