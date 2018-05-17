<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#99FFCC">
<% 
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DATASHOP","1234");
	PreparedStatement ps=con.prepareStatement("select count(distinct email) from user_master ");
	
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
	int no=rs.getInt(1);
%>
<br>
<br>
<br>
<br>
<b>Currently we have</b> &nbsp;  <%=no %>  &nbsp;<b>registered users</b>
<br>
<br>
<a href="adminpage.jsp">Go back</a>
<%
	}
	}catch(Exception e)
{
	e.printStackTrace();
}
%>
</body>
</html>