<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${ctx}/res/script/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="${ctx}/plugins/highCharts/highcharts.js"></script>
<script type="text/javascript" src="${ctx}/plugins/highCharts/exporting.js"></script>
<script type="text/javascript" src="${ctx}/js/highcharts/highcharts.js"></script>
<title>饼状图 test</title>
</head>
<body>
	<div id="containerColumn" style="min-width:400px;height:400px"></div>
</body>
</html>