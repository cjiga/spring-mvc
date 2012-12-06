<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<title>Portal Docente Spring</title>
<!-- Bootstrap -->
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.min.css" rel="stylesheet" media="screen">
        
	<script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		
				<%@include file="head.jsp"%>
		
	<div class="nav-collapse collapse">	
				<%@include file="menu.jsp"%>
	</div>	
	<div class="row">
		<div class="span9">
				<%@include file="content.jsp"%>
		</div>
	</div>	
	<footer class="footer">
				<%@include file="footer.jsp"%>
	</footer>		


	</div>
</body>
</html>
