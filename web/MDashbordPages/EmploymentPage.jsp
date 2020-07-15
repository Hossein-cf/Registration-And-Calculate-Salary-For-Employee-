<%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 7/7/2020
  Time: 11:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employment</title>
    <link rel="stylesheet" href="../ManagerDashbordStyle/css/dashbordStyle.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
          integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="../ManagerDashbordStyle/css/employmentStyle.css">
</head>
<body>

<section id="sideMenu">
    <nav>
        <a class="a-side" href="#"><i class="fa fa-tachometer fa-2x" aria-hidden="true"></i>
            DashBord</a>
        <a class="a-side" href="#"><i class="fa fa-briefcase fa-2x" aria-hidden="true"></i>
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

<section class="pane-1-e">


    <form id="regForm" action="">

        <h1>Complete information about the Employee</h1>

        <!-- One "tab" for each step in the form: -->
        <div class="tab">
            <%--            <p><input placeholder="First name..." oninput="this.className = ''"></p>--%>
            <%--            <p><input placeholder="Last name..." oninput="this.className = ''"></p>--%>
            <div class="tab-1">
                <div class="custom-select" style="width:200px;">
                    <select>
                        <option value="0">Employee Type :</option>
                        <option value="1">Data Base Expert</option>
                        <option value="2">Net Work Security Expert</option>
                        <option value="3">full stack</option>
                        <option value="4">Front end</option>
                        <option value="5">Back end</option>
                    </select>
                </div>
                <div class="custom-select" style="width:200px;">
                    <select>
                        <option value="0">Employee Level :</option>
                        <option value="1">Junior</option>
                        <option value="2">Mid-level</option>
                        <option value="3">Senior</option>

                    </select>
                </div>
                <div class="custom-select" style="width:200px;">
                    <select>
                        <option value="0">Work Time :</option>
                        <option value="1">Full time(8-20)</option>
                        <option value="2">Morning work(8-14)</option>
                        <option value="3">afternoon work(14-22)</option>
                        <option value="4">Night work(22-16)</option>

                    </select>
                </div>

            </div>

        </div>

        <div class="tab">
            <br>
            <h2>Personal Info</h2>
            <br>
            <div class="test">
                <div class="t">
                    <input name="firstName" placeholder="First Name" type="text"/>
                </div>
                <div class="t">
                    <input name="lastName" placeholder="Last Name" type="text"/>
                </div>
                <div class="t">
                    <input name="FatherName" placeholder="Father Name" type="text"/>
                </div>
                <div style="width: 300px" class="t">
                    <input name="NationalCode" placeholder="National Code" type="text"/>
                </div>
            </div>

            <div class="test">
                <div  class="t">
                    <input style="width: 200px" name="firstName" placeholder="Born palce" type="text" />
                </div>

                <div class="t">
                    <div class="custom-select Gender" id="Gender" style="width:200px;margin-right: 10px;">
                        <select>
                            <option value="0">Gender :</option>
                            <option value="1">Male</option>
                            <option value="2">Gender</option>
                        </select>
                    </div>
                </div>
                <div class="t">
                    <div class="custom-select" style="width:200px;">
                        <select>
                            <option value="0">Level of Eduction :</option>
                            <option value="1">Male</option>
                            <option value="2">Gender</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="test-address">
                <p><input placeholder="Address" oninput="this.className = ''"></p>
            </div>
            <div class="test">
                <div class="t">
                    <input style="width: 300px" name="PostalCode" placeholder="Postal Code" type="text" />

                </div>
                <div class="t">
                    <input style="width: 500px" name="PhoneNumber" placeholder="Phone Number" type="text" />
                </div>

            </div>





        </div>

        <div class="tab">
            <fieldset>
                <legend>Extras</legend>
                <p><label class="choice"> <input type="checkbox" name="extras" value="baby"> Baby Seat </label></p>
                <p><label class="choice"> <input type="checkbox" name="extras" value="wheelchair"> Wheelchair Access </label></p>
                <p><label class="choice"> <input type="checkbox" name="extras" value="tip"> Stock Tip </label></p>
            </fieldset>
        </div>

        <div class="tab">

        </div>

        <div style="margin-top: 30px">
            <div style="float:right;">
                <a href="#" class="btn-solid-lg"  type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</a>
                <a href="#" class="btn-solid-lg" type="button" id="nextBtn" onclick="nextPrev(1)">Next</a>
            </div>
        </div>


        <div style="text-align:center;margin-top:40px;">
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
            <span class="step"></span>
        </div>

    </form>

</section>

<script src="../ManagerDashbordStyle/js/EmploymentScript.js"></script>


</body>
</html>
