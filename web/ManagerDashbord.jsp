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
    <link rel="stylesheet" href="./ManagerDashbordStyle/css/dashbordStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
    <section id="sideMenu">
        <nav>
            <a class="a-side" href="./ManagerDashbord.jsp" ><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
                 DashBord</a>
            <a class="a-side" href="MDashbordPages/EmploymentPage.jsp"><i class="fa fa-briefcase fa-2x" aria-hidden="true"></i>
                 Employment</a>
            <a class="a-side" href="#"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
                 Issuance Receipt</a>
            <a class="a-side" href="#"> <i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
                 Daily Records</a>
            <a class="a-side" href="#"> <i class="fa fa-building fa-2x" aria-hidden="true"></i>
                 Company Members</a>
        </nav>
    </section>

    <header>
        <div class="search-area">
           search icon
            <input id="search-input" type="text" name="" value="">
        </div>
        <div class="user-area">
            <a class="a-header" href="#">+add</a>
            <a class="a-header" href="#">bell<span>3</span></a>
            <a class="a-header" href="#">
                <div class="user-image"></div>
               down icon
            </a>
        </div>
    </header>
    <section class="content-area">
        <div class="heading">
            <h1>
                Welcome to your DashBord
            </h1>
            <p>
                nkci.sdnvbdslndsbkcnsdv khj
            </p>

        </div>
    </section>

    <section class="pane-1">
        <div >

        </div>

    </section>
    <section>
        <div class="cards">

            <div class="card-1">

                <div class="See-charts">
                    <span class="Developing">  </span>
                </div>
            </div>
            <div class="card-2">
                <div class="user-image"></div>
                <span class="about-us"> </span>
                <span class="Cheack-Team"></span>
            </div>
        </div>
    </section>



</body>
</html>