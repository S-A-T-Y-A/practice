<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${name}</title>
</head>
<body>
<%String lastname="Nandan";
	String Fullname= request.getAttribute("name")+" "+lastname;
%>
<h1><%=Fullname %></h1>
</body>
</html>