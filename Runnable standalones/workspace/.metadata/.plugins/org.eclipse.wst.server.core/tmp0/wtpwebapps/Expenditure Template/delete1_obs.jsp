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
String email=request.getParameter("email");
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DATASHOP","1234");
	PreparedStatement ps=con.prepareStatement("delete from expense_details where usermail=? ");
	PreparedStatement ps1=con.prepareStatement("delete from expenditure_master where usermail=?");
	PreparedStatement ps2=con.prepareStatement("delete from user_master where email=?");
	ps.setString(1,email);
	ps1.setString(1,email);
	ps2.setString(1,email);
	int i=ps.executeUpdate();
	int j=ps1.executeUpdate();
	int k=ps2.executeUpdate();
			if(i>0&&j>0&&k>0)
			{
		%><br>
				<br>
				<br>
				<hr>
				<center>
		<h3>Success fully deleted all records of <%= email %></h3>
		<a href="adminpage.jsp">Click here</a>
		</center>
		<%
			}
			else{
				%>
				<br>
				<br>
				<br>
				<hr>
				<center>
				<h3>You have done something wrong...Follow the manual or contact your developer</h3>
				<a href="delete.jsp">Click here</a>
				</center>
				<%
			}
}catch(Exception e)
			{
				e.printStackTrace();
			}
		%>
</body>
</html>