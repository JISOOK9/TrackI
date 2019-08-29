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
<script src="js/factorSetForm.js"></script>

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

				<li class="nav-item"><a
					class="nav-link js-scroll-trigger" onclick="userMainDir('${factors.uid}');">GoToMain</a>

				</li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid p-0">
		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="statisticResults">
			<div class="w-100">
				<h2 class="mb-5">Correlations</h2>

				<div class="subheading mb-3">

					<c:if test="${factors.factor1 != null}">
						<p>

							<label class="factorLabel">- ${factors.factor1}</label><br>

							${corrs1 }
						</p>
					</c:if>
					<c:if test="${factors.factor2 != null}">
						<p>

						<label class="factorLabel">- ${factors.factor2}</label><br>

							${corrs2 }
						</p>
					</c:if>
					<c:if test="${factors.factor3 != null}">
						<p>

						<label class="factorLabel">- ${factors.factor3}</label><br>

							${corrs3 }

						</p>
					</c:if>
					<c:if test="${factors.factor4 != null}">
						<p>

						<label class="factorLabel">- ${factors.factor4}</label><br>

							${corrs4 }
						</p>
					</c:if>

					

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
