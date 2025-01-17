<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Sign up</title>
</head>
<body>
	<input type="hidden" id="status"
		value="<%=request.getAttribute("status")%>">


	<div class="main">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container">
				<div class="signup-content">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>

						<form method="post" action="" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
							</div>
							<div class="form-group">
								<input type="checkbox" name="agree-term" id="agree-term"
									class="agree-term" /> <label for="agree-term"
									class="label-agree-term"><span><span></span></span>I
									agree all statements in <a href="#" class="term-service">Terms
										of service</a></label>
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" />
							</div>
						</form>
					</div>
					<div class="signup-image">
						<figure>
							<img
								src="${pageContext.request.contextPath}/login-project/images/signup-image.jpg"
								alt="sing up image">
						</figure>
						<a href="${pageContext.request.contextPath}/login"
							class="signup-image-link">I am already member</a>
					</div>
				</div>
			</div>
		</section>


	</div>
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">

	<script type="text/javascript">
		var status = document.getElementById("status").value;
		if (status == "success")
			swal("Congrats", "Account Created Successfully", "success");
		if (status == "invalidName")
			swal("Sorry", "Please Enter Name", "error");
		if (status == "invalidEmail")
			swal("Sorry", "Please Enter Email", "error");
		if (status == "invalidUpwd")
			swal("Sorry", "Please Enter Password", "error");
		if (status == "invalidConfirmUpwd")
			swal("Sorry", "Password do not match", "error");
		if (status == "invalidEmail")
			swal("Sorry", "Please Enter Email", "error");
		if (status == "invalidMobile")
			swal("Sorry", "Please Enter Mobile Number", "error");
		if (status == "invalidMobileLength")
			swal("Sorry", "Mobile Number should be of 10 digit", "error");
	</script>
</body>
<!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>