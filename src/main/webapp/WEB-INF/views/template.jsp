<%@ include file="/WEB-INF/views/include/tagLib.jsp" %> 

<html>
<head>
<%@ include file="/WEB-INF/views/include/titulo.jsp" %> 
<link href="${pageContext.request.contextPath}/resources/css/normalize.css" rel="stylesheet">	
<!-- Bootstrap -->
<link href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap.css"  rel="stylesheet" >
<link href="${pageContext.request.contextPath}/resources/css/bootstrap/bootstrap-responsive.css" rel="stylesheet">	

<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.js"></script>
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
