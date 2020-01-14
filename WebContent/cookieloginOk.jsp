<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie c: cookies){
			out.println("name: " + c.getName() + "\n");
			out.println("Value: " + c.getValue() + "\n");
			out.println("----------------- -----------" + "\n");

		}
		
	
	%>
</body>
</html>