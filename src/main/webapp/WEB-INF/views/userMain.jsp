<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%@ page session="true"%>
<%@ page import="com.koo.tracki.db.*"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>trackInside</title>
<script src="//code.jquery.com/jquery-3.2.1.min.js"
	type="text/javascript">
	
</script>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom fonts for this template -->
<link
	href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i"
	rel="stylesheet">
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/userMain.css" rel="stylesheet">
<script src="js/userMain.js"></script>

</head>

<body id="page-top">

	<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top"
		id="sideNav">
		<a class="navbar-brand js-scroll-trigger" href="#page-top"> <span
			class="d-block d-lg-none">TrackInside</span> <span
			class="d-none d-lg-block"> <img
				class="img-fluid img-profile rounded-circle mx-auto mb-2"
				src="images/profile.jpg" alt="">
		</span>
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#user-main">Score_Today</a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#score">Score_Factors</a></li>
				<!-- <li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="sttProcess">Statistics</a></li> -->
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="sttResult">Correlations</a></li>
				<li class="nav-item">
					<a class="nav-link js-scroll-trigger"
					href="setFactorForm">Set_Own_Factors</a> 
				</li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid p-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="user-main">
			<div class="w-100">
				<%-- <h1 class="mb-0">Hi ${nick} !</h1> --%>
				<h1 class="mb-0">Hi,  ${nick} !</h1>
				<h2>
					<span class="text-primary"><br>How was your day?</span>
				</h2>
				<br>
				<div class="subheading mb-5">
					<form action="scoreDay" method="post" enctype="utf-8">

						<p>
							<label>Today`s Mood Score:<br> <input type="radio"
								name="scrMood" value="5">&nbsp; 5 &nbsp; &nbsp; &nbsp;
								<input type="radio" name="scrMood" value="4">&nbsp; 4
								&nbsp; &nbsp; &nbsp; <input type="radio" name="scrMood"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input
								type="radio" name="scrMood" value="2">&nbsp; 2&nbsp;
								&nbsp; &nbsp; <input type="radio" name="scrMood" value="1">&nbsp;
								1

							</label>
						</p>
						<p>
							<label>Today`s Memo:<br> <textarea cols="60"
									rows="5" name="memo"></textarea>
							</label>
						</p>
						<input type="submit" value="Save"> <input type="reset"
							value="Cancel">
					</form>
				</div>
				<p class="lead mb-5">Record Your Day_Keep Score Your Day___Find
					Your Inner Self!</p>

			</div>
		</section>

		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="score">
			<div class="w-100">
				<h2 class="mb-5">Score Your Own Factors</h2>
				
				<div class="subheading mb-3">
					<form action="scoreFactors" method="post" enctype="utf-8">
						<c:if test="${factors.factor1 != null}">	
						<p>
		
											<label class="factorLabel">- ${factors.factor1}</label><br> 
											
						<input type="radio" name="scrF1" value="5">&nbsp; 5 &nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF1" value="4">&nbsp;
							4 &nbsp; &nbsp; &nbsp; <input type="radio" name="scrF1"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input
								type="radio" name="scrF1" value="2">&nbsp; 2&nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF1" value="1">&nbsp;
							1

						
					</p>
						</c:if>
						<c:if test="${factors.factor2 != null}">
						<p>
		
											<label class="factorLabel">- ${factors.factor2}</label><br> 
						<input type="radio" name="scrF2" value="5">&nbsp; 5 &nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF2" value="4">&nbsp;
							4 &nbsp; &nbsp; &nbsp; <input type="radio" name="scrF2"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input
								type="radio" name="scrF2" value="2">&nbsp; 2&nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF2" value="1">&nbsp;
							1

						
					</p>
						</c:if>
						<c:if test="${factors.factor3 != null}">
						<p>
		
											<label class="factorLabel">- ${factors.factor3}</label><br> 
						<input type="radio" name="scrF3" value="5">&nbsp; 5 &nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF3" value="4">&nbsp;
							4 &nbsp; &nbsp; &nbsp; <input type="radio" name="scrF3"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input
								type="radio" name="scrF3" value="2">&nbsp; 2&nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF3" value="1">&nbsp;
							1

						
					</p>
						</c:if>
						<c:if test="${factors.factor4 != null}">
						<p>
		
											<label class="factorLabel">- ${factors.factor4}</label><br> 
						<input type="radio" name="scrF4" value="5">&nbsp; 5 &nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF4" value="4">&nbsp;
							4 &nbsp; &nbsp; &nbsp; <input type="radio" name="scrF4"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input
								type="radio" name="scrF4" value="2">&nbsp; 2&nbsp;
							&nbsp; &nbsp; <input type="radio" name="scrF4" value="1">&nbsp;
							1

						
					</p>
						</c:if>

					<input type="submit" value="Save"> <input type="reset"
							value="Clear"> 
				</form>
				</div>

				
		</section>

	</div>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for this template -->
	<script src="js/resume.min.js"></script>

</body>

</html>
