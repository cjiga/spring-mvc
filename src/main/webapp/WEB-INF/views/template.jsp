<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<html>
<head>
<title>Portal Docente Spring</title>
<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css"
	rel="stylesheet" media="screen">

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<tiles:insertAttribute name="head" />
		<div class="nav-collapse collapse">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="row">
			<div class="span9">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
		<div class="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>
