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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<section id="sideMenu">
    <nav>
        <a class="a-side" href="./ManagerDashbord.jsp"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord</a>
        <a class="a-side" href="MDashbordPages/EmploymentPage.jsp"><i class="fa fa-briefcase fa-2x"
                                                                      aria-hidden="true"></i>
            Employment</a>
        <a class="a-side" href="MDashbordPages/IssuanceReceiptPage.jsp"><i class="fa fa-list-alt fa-2x" aria-hidden="true"></i>
            Issuance Receipt</a>
        <a class="a-side" href="MDashbordPages/DailyRecordsPage.jsp"> <i class="fa fa-check-square-o fa-2x" aria-hidden="true"></i>
            Daily Records</a>
        <a class="a-side" href="MDashbordPages/CompanyMembersPage.jsp"> <i class="fa fa-building fa-2x"
                                                                           aria-hidden="true"></i>
            Company Members</a>
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
            <span class="turquoise">Welcome to Your Management  System </span>
        </h1>
        <br>
        <p class="txt-style">
            here is your salary Management System Dashbord,you can use the side bar in the left, to go to different part
            of Application ,that if you want to know more about their functions click on the HELP in
            navigation bar on top of the page .
        </p>

    </div>
</section>

<section class="pane-1">
<%--    1--%>
    <div class="row-in-pane">

        <div class="inline-row-1">
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="./ManagerDashbordStyle/pics/Company.jpg" alt="Avatar"
                             style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Company Name:</h1>
                        <p>Unknown</p>
                        <h1>Company type:</h1>
                        <p>Private</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="inline-row-1">
            <div class="first-pane">
                <h1 class="first-pane-text" style="font-size: 25px;">Welcome to Your Management  System <br> Manage For Free</h1>
                <p class="p-large">"You can use this web application for free to manage your company accounting easily, that our team develop it by java language" </p>
            </div>

        </div>



    </div>




</section>

<section class="pane-1">
<%--    2--%>
    <div class="row-in-pane">



        <div class="inline-row-1">
            <section class="second-pane">

                <h1 class="second-pane-text" style="font-size: 25px;">You can improve Process of Salary Payment   <br> With this Application</h1>
                <p class="p-large">"You can use this web application for free to manage your company accounting easily, that our team develop it by java language" </p>

            </section>
        </div>


        <div class="inline-row-1" style="margin-left: 300px;">
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="ManagerDashbordStyle/pics/flat.png" alt="Avatar"
                             style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Hired Employee Numbers:</h1>
                        <p>0</p>
                        <h1>Payed Salaries</h1>
                        <p>$0</p>
                    </div>
                </div>
            </div>
        </div>

    </div>



</section>


<section class="pane-1">
<%--    3--%>
    <div class="row-in-pane">

        <div class="inline-row-1" >
            <div class="flip-card">
                <div class="flip-card-inner">
                    <div class="flip-card-front">
                        <img src="./ManagerDashbordStyle/pics/TeamPics.png" alt="Avatar"
                             style="width:300px;height:300px;">
                    </div>
                    <div class="flip-card-back">
                        <h1>Back End Team:</h1>
                        <p>Hossein Shakeri& Ali isaZadeh</p>
                        <h1>Front End:</h1>
                        <p>Ghader Salehi</p>
                    </div>
                </div>
            </div>
        </div>

        <div class="inline-row-1">
            <section class="third-pane">
                <h1 class="third-pane-text" style="font-size: 25px;">About Our Team:  </h1>
                <p class="p-large">" Our Team with two Back End Developer And a Front End Developer , Develope this Web Application by java Language   " </p>
            </section>
        </div>

    </div>



</section>


<section>

</section>


</body>
</html>