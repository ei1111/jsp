<%@page import="java.util.ArrayList"%>
<%@page import="org.omg.CORBA.Request"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>	
	<%!
		String m_name; 
		String m_pass; 
		String m_gender; 
		String m_residence; 
		ArrayList<String> m_hobby;
	%>
	
	<%
		m_name =(String)session.getAttribute("m_name");
		m_pass = (String)session.getAttribute("m_pass");
		m_gender = (String)session.getAttribute("m_gender");
		m_residence = (String)session.getAttribute("m_residence");
		m_hobby = (ArrayList)session.getAttribute("m_hobby");
	
	%>
	
	<%=m_name%></br>
	<%=m_pass%></br>
	<%=m_gender%></br>
	<%=m_residence%></br>
	<%
		for(int i = 0; i < m_hobby.size(); i++){
	%>
	
	<%= m_hobby.get(i) %><br/>		
	
	<%
	}
	%>
</body>
</html>