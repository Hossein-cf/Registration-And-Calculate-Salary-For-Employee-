<%@ page import="Extra.employeeTypes.DB_Expert" %>
<%@ page import="Extra.employeeTypes.Back_End" %>
<%@ page import="Extra.GenerateEmployeeNumber" %><%--
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

<section class="pane-1-e">


    <form id="regForm" action="">

        <h1>Complete information about the Employee</h1>

        <!-- One "tab" for each step in the form: -->
        <div class="tab">
            <%--            <p><input placeholder="First name..." oninput="this.className = ''"></p>--%>
            <%--            <p><input placeholder="Last name..." oninput="this.className = ''"></p>--%>
            <div class="tab-1">
                <div class="custom-select" style="width:200px;">
                    <select id="EType">
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
                <div class="t">
                    <input style="width: 200px" name="Born" placeholder="Born palce" type="text"/>
                </div>

                <div class="t">
                    <input style="width: 100px;padding-right: 10px" name="Age" placeholder="Age" type="text"/>
                </div>

                <div class="t">
                    <div class="custom-select Gender" id="Gender" style="width:200px;padding-right: 10px;">
                        <select>
                            <option value="0">Gender :</option>
                            <option value="1">Male</option>
                            <option value="2">FeMale</option>
                        </select>
                    </div>
                </div>
                <div class="t">
                    <div class="custom-select" style="width:200px;">
                        <select>
                            <option value="0">Level of Eduction :</option>
                            <option value="1">Diploma</option>
                            <option value="2">Bachelor</option>
                            <option value="3">MA</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="test-address">
                <p><input placeholder="Address" oninput="this.className = ''"></p>
            </div>
            <div class="test">
                <div class="t">
                    <input style="width: 300px" name="PostalCode" placeholder="Postal Code" type="text"/>

                </div>
                <div class="t">
                    <input style="width: 500px" name="PhoneNumber" placeholder="Phone Number" type="text"/>
                </div>

            </div>
            <div class="test">
                <div class="t">
                    <input style="width: 300px" name="HomePhoneNumber" placeholder="Home Phone Number" type="text"/>

                </div>
                <div class="t">
                    <div class="custom-select" style="width:200px;">
                        <select>
                            <option value="0">marital status :</option>
                            <option value="1">Married</option>
                            <option value="2">Single</option>
                        </select>
                    </div>
                </div>
                <div class="t">

                    <input style="width: 200px;padding-right: 20px" name="number of children" placeholder="number of Children" type="text"/>

                </div>

            </div>

        </div>

        <div class="tab">
            <div class="row-c">


                <div class="custom-pane">


                    <div class="c1">
                        <label>Git</label>
                    </div>
                    <div class="c2">
                        <input type="checkbox">
                    </div>


                </div>

                <div class="custom-pane">


                    <div class="c1">
                        <label>Telle Working</label>
                    </div>
                    <div class="c2">
                        <input type="checkbox">
                    </div>


                </div>
                <div class="custom-pane">


                    <div class="c1">
                        <label>Mac/Linux</label>
                    </div>
                    <div class="c2">
                        <input type="checkbox">
                    </div>


                </div>
            </div>

        </div>


        <table id="spcTable" class="tab">
            <tr class="tbl" >
                <th style="width: 500px; ">Specialty</th>
                <th style="width: 500px; ">Choose</th>
            </tr>

        </table>



        <div style="margin-top: 30px">
            <div style="float:right;">
                <a href="#" class="btn-solid-lg" type="button" id="prevBtn" onclick="nextPrev(-1)">Previous</a>
                <a href="#" class="btn-solid-lg" type="button" id="nextBtn"  onclick="nextPrev(1),CreateRows();">Next</a>
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
<script>


    function CreateRows() {


        var  tbl = document.getElementById("spcTable");

        var ET = document.getElementById("EType");

        if( ET.selectedIndex=== 1){
            var spc = ["DataBaseImplementationAndDesign","Bottleneck","BackupAndRecovery","SQL","Replication","dataBaseAdministration","backUpAndRecovery","clustering"];
            for (let i = 0; i < spc.length ; i++) {
                var row = tbl.insertRow();
                var cell1 = row.insertCell();
                var cell2 = row.insertCell();
                cell1.innerHTML=spc[i];
                var chk = document.createElement('input');
                chk.setAttribute('type','checkbox');
                chk.setAttribute('id','chek'+i);
                chk.setAttribute('name','chek'+i);
                cell2.appendChild(chk);
            }
            tbl.setAttribute('id','sd');
        }
        else if(ET.selectedIndex=== 2){
            var spc = ["UTM","ISMS","PLC","CEH","CISSP","CCNA","QOD","HAIPE_IP","MPLS"];
            for (let i = 0; i < spc.length ; i++) {
                var row = tbl.insertRow();
                var cell1 = row.insertCell();
                var cell2 = row.insertCell();
                cell1.innerHTML=spc[i];
                var chk = document.createElement('input');
                chk.setAttribute('type','checkbox');
                chk.setAttribute('id','chek'+i);
                chk.setAttribute('name','chek'+i);
                cell2.appendChild(chk);
            }
            tbl.setAttribute('id','sd');
        }
        else if(ET.selectedIndex=== 3){
            var spc = ["CSS","JS","reactJs","jQuery","mobilePrograming","python","ruby","nodeJs","PHP7","ASP_NET","webServer","SQLServer","oracleDatabase","xamarin","security","docker"];
            for (let i = 0; i < spc.length ; i++) {
                var row = tbl.insertRow();
                var cell1 = row.insertCell();
                var cell2 = row.insertCell();
                cell1.innerHTML=spc[i];
                var chk = document.createElement('input');
                chk.setAttribute('type','checkbox');
                chk.setAttribute('id','chek'+i);
                chk.setAttribute('name','chek'+i);
                cell2.appendChild(chk);
            }
            tbl.setAttribute('id','sd');
        }
        else if(ET.selectedIndex=== 4){
            var spc = ["CSS","JS","XHTR","HTMLDOM","JAVAScript","ReactJs","Angular","VueJs","jQuery","TypeScript","ES6","yarn","npm","CSSResponsive","json","ajax","materialDesign","bootStrap","W3Css"];
            for (let i = 0; i < spc.length ; i++) {
                var row = tbl.insertRow();
                var cell1 = row.insertCell();
                var cell2 = row.insertCell();
                cell1.innerHTML=spc[i];
                var chk = document.createElement('input');
                chk.setAttribute('type','checkbox');
                chk.setAttribute('id','chek'+i);
                chk.setAttribute('name','chek'+i);
                cell2.appendChild(chk);
            }
            tbl.setAttribute('id','sd');
        }
        else if(ET.selectedIndex=== 5){
            var spc = ["python","ruby","node_JS","PHP7","ASP_NET","webServer","SQLServer","OracleDatabase","RestfulAPIs","Security","Docker"];
            for (let i = 0; i < spc.length ; i++) {
                var row = tbl.insertRow();
                var cell1 = row.insertCell();
                var cell2 = row.insertCell();
                cell1.innerHTML=spc[i];
                var chk = document.createElement('input');
                chk.setAttribute('type','checkbox');
                chk.setAttribute('id','chek'+i);
                chk.setAttribute('name','chek'+i);
                cell2.appendChild(chk);
            }
            tbl.setAttribute('id','sd');
        }


    }

</script>
<script>

    function nextPrev(n) {

        var x = document.getElementsByClassName("tab");

        if (n === 1 && !validateForm()) return false;
        x[currentTab].style.display = "none";
        currentTab = currentTab + n;
        if (currentTab >= x.length) {

            alert("Employee Code : "+<%= GenerateEmployeeNumber.generateNumber()%>);
            document.getElementById("regForm").submit();

            return false;

        }

        showTab(currentTab);
    }

</script>

</body>
</html>
