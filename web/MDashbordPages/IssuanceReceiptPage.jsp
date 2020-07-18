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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<section id="sideMenu">
    <nav>
        <a class="a-side" href="../ManagerDashbord.jsp"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord</a>
        <a class="a-side" href="../MDashbordPages/EmploymentPage.jsp"><i class="fa fa-briefcase fa-2x"
                                                                         aria-hidden="true"></i>
            Employment</a>
        <a class="a-side" href="../MDashbordPages/IssuanceReceiptPage.jsp"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
            Issuance Receipt</a>
        <a class="a-side" href="../MDashbordPages/DailyRecordsPage.jsp"> <i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
            Daily Records</a>
        <a class="a-side" href="../MDashbordPages/CompanyMembersPage.jsp"> <i class="fa fa-building fa-2x" aria-hidden="true"></i>
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
            In Issuance Receipt Section :
        </h1>

        <p>
            " You can calculate final Salary of Employee that works a month in your Company "       </p>

        <p>
            " Search the Employee by Employee Code and Fill the blanks  "
        </p>

    </div>
</section>



<section class="pane-1-members" style="height:100px ">
    <div class="search-part">

        <form class="example" >
            <input type="text" placeholder="Search Employee by ID" name="search">
            <button type="submit"><i class="fa fa-search"></i></button>
        </form>
    </div>


</section>
<section class="pane-1-members,title" >
    <div class="search-part">
        <h2>
            Employee Personal Info:
        </h2>

        <p>

        </p>

        <br>

        <h2>
            Employee Job Info:
        </h2>

        <br>

        <p>

        </p>

        <br>



    </div>

<hr>
</section>

<section class="pane-1-members">
    <div class="search-part-form">

        <h1  >
            Calculating Final Salary
        </h1>


            <div class="col-75">
                <div class="container">
                    <form  name="IssuanceReceipt" action="Receipt.jsp">

                        <div class="row">
                            <div class="issu">

                                    <div class="col-50" >
                                        <label for="state">Over Time</label>
                                        <input style="width: 200px" type="text" id="state" name="state" placeholder=".">
                                    </div>

                                    <div class="col-50">
                                        <label for="zip">Vacation </label>
                                        <input  style="width: 200px"  type="text" id="zip" name="zip" placeholder=".">
                                    </div>





                                    <div class="col-50" >
                                        <label for="expyear">Absence Days</label>
                                        <input  style="width: 200px"   type="text" id="expyear" name="expyear" placeholder=".">
                                    </div>


                            </div>

                        </div>

                        <input style="width: 250px;margin-left: 470px;margin-top: 50px" type="submit" value="Continue to show Receipt"   class="btn">

                    </form>
                </div>
            </div>


        </div>



</section>

<section>

</section>


</body>
</html>