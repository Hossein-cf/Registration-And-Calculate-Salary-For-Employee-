<%--
  Created by IntelliJ IDEA.
  User: DARK GHOST
  Date: 6/30/2020
  Time: 6:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Management System</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="./ManagerLoginStyle/images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/css/util.css">
    <link rel="stylesheet" type="text/css" href="./ManagerLoginStyle/css/main.css">
    <!--===============================================================================================-->
</head>
<body>
<c:forEach  var="valore" items="${requestScope.message}" varStatus="theCount">//message is the key to pass the ArrayList "lista" to this jsp page.
    <a href ="./es3"> <c:out value="${valore}"/> </a>
    <a id="${theCount.index}"></a>
</c:forEach>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="./ManagerLoginStyle/images/img-01.png" alt="IMG">
            </div>

            <form name="login to employee" action="EmployeeLoginServlet" method="post" class="login100-form validate-form">
					<span class="login100-form-title">
						Login as Employee
					</span>

                <div class="wrap-input100 validate-input" data-validate = "User Name is required">
                    <input class="input100" type="text" name="userName" placeholder="User Name(Employee Code)">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-user" aria-hidden="true"></i>
						</span>
                </div>

                <div  class="wrap-input100 validate-input" data-validate = "Password is required">
                    <input class="input100" type="password" name="pass" placeholder="Password(National Code)">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
                </div>

                <div  class="container-login100-form-btn">
                    <button  class="login100-form-btn">
                        Login
                    </button>
                    <a href="./EDashbordPages/EmployeeDashbord.jsp"> sgo</a>

                </div>




                <div class="text-center p-t-136">

                </div>
            </form>
        </div>
    </div>
</div>




<!--===============================================================================================-->
<script src="./ManagerLoginStyle/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="./ManagerLoginStyle/vendor/bootstrap/js/popper.js"></script>
<script src="./ManagerLoginStyle/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="./ManagerLoginStyle/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="./ManagerLoginStyle/vendor/tilt/tilt.jquery.min.js"></script>
<script >
    $('.js-tilt').tilt({
        scale: 1.1
    })
</script>
<!--===============================================================================================-->
<script src="./ManagerLoginStyle/js/main.js"></script>

</body>
</html>
