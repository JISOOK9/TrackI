<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>trackInside</title>

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
<link href="css/resume.css" rel="stylesheet">

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
					href="#about">Home</a></li>
				<li class="nav-item">
					<!--         	<a class="nav-link" href="index.html">Home</a> --> <a
					class="nav-link js-scroll-trigger" href="#signin">SignIn</a>
				</li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#signup">SignUp</a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="calendar">Skills</a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#interests">Interests</a></li>
				<li class="nav-item"><a class="nav-link js-scroll-trigger"
					href="#awards">Awards</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid p-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="about">
			<div class="w-100">
				<h1 class="mb-0">
					Hi ${nick} !</h1>
					<h2><span class="text-primary"><br>How was your
						day?</span></h2>
				<br>
				<div class="subheading mb-5">
					<form action="scoreDay" method="post" enctype="utf-8">

						<p>
							<label>Today`s score:<br> 
							<input type="radio" name="dayscore"
								value="5">&nbsp; 5 &nbsp; &nbsp; &nbsp; <input type="radio" name="dayscore"
								value="4">&nbsp; 4 &nbsp; &nbsp; &nbsp; <input type="radio" name="dayscore"
								value="3">&nbsp; 3&nbsp; &nbsp; &nbsp; <input type="radio" name="dayscore"
								value="2">&nbsp; 2&nbsp; &nbsp; &nbsp; <input type="radio" name="dayscore"
								value="1">&nbsp; 1

							</label>
						</p>
						<p>
							<label>Today`s Memo:<br> <textarea cols="100" rows="5"
								name="memo" ></textarea>
							</label>
						</p>
						<input type="submit" value="Create"> <input type="reset"
							value="Cancel">
					</form>
				</div>
				<p class="lead mb-5">Record Your Day_Keep Score Your Day___Find
					Your Inner Self!</p>
				<div class="social-icons">
					<a href="#"> <i class="fab fa-linkedin-in"></i>
					</a> <a href="#"> <i class="fab fa-github"></i>
					</a> <a href="#"> <i class="fab fa-twitter"></i>
					</a> <a href="#"> <i class="fab fa-facebook-f"></i>
					</a>
				</div>
			</div>
		</section>

		<hr class="m-0">

		<section
			class="resume-section p-3 p-lg-5 d-flex justify-content-center"
			id="signup">
			<div class="w-100">
				<h2 class="mb-5">SignUp</h2>

				<div
					class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5">
					<div class="resume-content">
						<form action="userReg" method="post" enctype="utf-8">
							<p>
								<label>ID:<br> <input type="text" name="uid" />
								</label>
							</p>
							<p>
								<label>Password:<br> <input type="password"
									name="pw" />
								</label>
							</p>
							<p>
								<label>Email:<br> <input type="text" name="email" />
								</label>
							</p>
							<p>
								<label>Nickname:<br> <input type="text" name="nick" />
								</label>
							</p>
							<p>
								<label>Gender:<br> <input type="radio"
									name="gender" value="M">Male <input type="radio"
									name="gender" value="F">Female

								</label>
							</p>
							<p>
								<label>BirthDate:<br> <input type="date"
									name="bdate" />
								</label>
							</p>
							<input type="submit" value="Create"> <input type="reset"
								value="Cancel">
						</form>
					</div>



				</div>
		</section>

		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="signin">
			<div class="w-100">
				<h2 class="mb-5">SignIn</h2>

				<div
					class="resume-item d-flex flex-column flex-md-row justify-content-between mb-5">
					<div class="resume-content">
						<form action="login" method="post" enctype="utf-8">
							<p>
								<label>ID:<br> <input type="text" name="uid" />
								</label>
							</p>
							<p>
								<label>Password:<br> <input type="password"
									name="pw" />
								</label>
							</p>
							<input type="submit" value="Create"> <input type="reset"
								value="Cancel">
						</form>

					</div>
				</div>

			</div>
		</section>

		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="skills">
			<div class="w-100">
				<h2 class="mb-5">Skills</h2>

				<div class="subheading mb-3">Programming Languages &amp; Tools</div>
				<ul class="list-inline dev-icons">
					<li class="list-inline-item"><i class="fab fa-html5"></i></li>
					<li class="list-inline-item"><i class="fab fa-css3-alt"></i></li>
					<li class="list-inline-item"><i class="fab fa-js-square"></i>
					</li>
					<li class="list-inline-item"><i class="fab fa-angular"></i></li>
					<li class="list-inline-item"><i class="fab fa-react"></i></li>
					<li class="list-inline-item"><i class="fab fa-node-js"></i></li>
					<li class="list-inline-item"><i class="fab fa-sass"></i></li>
					<li class="list-inline-item"><i class="fab fa-less"></i></li>
					<li class="list-inline-item"><i class="fab fa-wordpress"></i>
					</li>
					<li class="list-inline-item"><i class="fab fa-gulp"></i></li>
					<li class="list-inline-item"><i class="fab fa-grunt"></i></li>
					<li class="list-inline-item"><i class="fab fa-npm"></i></li>
				</ul>

				<div class="subheading mb-3">Workflow</div>
				<ul class="fa-ul mb-0">
					<li><i class="fa-li fa fa-check"></i> Mobile-First, Responsive
						Design</li>
					<li><i class="fa-li fa fa-check"></i> Cross Browser Testing
						&amp; Debugging</li>
					<li><i class="fa-li fa fa-check"></i> Cross Functional Teams</li>
					<li><i class="fa-li fa fa-check"></i> Agile Development &amp;
						Scrum</li>
				</ul>
			</div>
		</section>

		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="interests">
			<div class="w-100">
				<h2 class="mb-5">Interests</h2>
				<p>Apart from being a web developer, I enjoy most of my time
					being outdoors. In the winter, I am an avid skier and novice ice
					climber. During the warmer months here in Colorado, I enjoy
					mountain biking, free climbing, and kayaking.</p>
				<p class="mb-0">When forced indoors, I follow a number of sci-fi
					and fantasy genre movies and television shows, I am an aspiring
					chef, and I spend a large amount of my free time exploring the
					latest technology advancements in the front-end web development
					world.</p>
			</div>
		</section>

		<hr class="m-0">

		<section class="resume-section p-3 p-lg-5 d-flex align-items-center"
			id="awards">
			<div class="w-100">
				<h2 class="mb-5">Awards &amp; Certifications</h2>
				<ul class="fa-ul mb-0">
					<li><i class="fa-li fa fa-trophy text-warning"></i> Google
						Analytics Certified Developer</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> Mobile Web
						Specialist - Google Certification</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> 1<sup>st</sup>
						Place - University of Colorado Boulder - Emerging Tech Competition
						2009</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> 1<sup>st</sup>
						Place - University of Colorado Boulder - Adobe Creative Jam 2008
						(UI Design Category)</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> 2<sup>nd</sup>
						Place - University of Colorado Boulder - Emerging Tech Competition
						2008</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> 1<sup>st</sup>
						Place - James Buchanan High School - Hackathon 2006</li>
					<li><i class="fa-li fa fa-trophy text-warning"></i> 3<sup>rd</sup>
						Place - James Buchanan High School - Hackathon 2005</li>
				</ul>
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
