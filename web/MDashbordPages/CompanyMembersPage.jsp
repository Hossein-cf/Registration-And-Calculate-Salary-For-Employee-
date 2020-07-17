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
            <a class="active" href="#home">Home</a>
            <a href="#news">News</a>
            <a href="#contact">Contact</a>
            <a href="#about">About</a>
        </div>
    </div>
</header>
<section class="content-area">
    <div class="heading">
        <h1>
            In Company Members Section ,
        </h1>

        <p>
            You can check out numbers of Employee that you hired        </p>

    </div>
</section>



<section class="pane-1">

        <div class="row-in-pane">

            <div class="inline-row-1">
                <div class="flip-card">
                    <div class="flip-card-inner">
                        <div class="flip-card-front">
                            <img src="../ManagerDashbordStyle/pics/front-end.png" alt="Avatar" style="width:300px;height:300px;">
                        </div>
                        <div class="flip-card-back">
                            <h1>Numbers of Front End Employee</h1>
                            <p>0</p>

                        </div>
                    </div>
                </div>
            </div>

            <div class="inline-row-1">
                <div class="flip-card">
                    <div class="flip-card-inner">
                        <div class="flip-card-front">
                            <img src="../ManagerDashbordStyle/pics/back-end.png" alt="Avatar" style="width:300px;height:300px;">
                        </div>
                        <div class="flip-card-back">
                            <h1>Numbers of Back End Employee</h1>
                            <p>0</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="inline-row-1">
                <div class="flip-card">
                    <div class="flip-card-inner">
                        <div class="flip-card-front">
                            <img src="../ManagerDashbordStyle/pics/fullstack-logo-light.jpg" alt="Avatar" style="width:300px;height:300px;">
                        </div>
                        <div class="flip-card-back">
                            <h1>Numbers of full stack Employee</h1>
                            <p>0</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</section>

<section class="pane-1-members">

    <div class="row-in-pane">

        <div class="inline-row-1-members">
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="../ManagerDashbordStyle/pics/DBS.png" alt="Avatar" style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Numbers of Data Base Expert</h1>
                        <p>0</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="inline-row-1-members">
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="../ManagerDashbordStyle/pics/Security.jpg" alt="Avatar" style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Numbers of NetWork Security Expert</h1>
                        <p>0</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="inline-row-1-members">
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="../ManagerDashbordStyle/pics/Ap.png" alt="Avatar" style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Numbers of App Developer</h1>
                        <p>0</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>



<section>

</section>


</body>
</html>