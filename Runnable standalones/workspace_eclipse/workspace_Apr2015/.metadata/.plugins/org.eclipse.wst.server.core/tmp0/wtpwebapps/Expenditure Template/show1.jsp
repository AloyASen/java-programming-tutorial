<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show</title>
</head>
<body bgcolor="#99FFCC">
<%
String email=request.getParameter("email");
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	PreparedStatement ps=con.prepareStatement("select * from user_master");
    ResultSet rs=ps.executeQuery();
    %>
    <center>
    <h1>User Details</h1>
    </center>
    <hr>
    <hr>
    <hr>
    <table  border="2" style="width:700px">
		<tr>
		<td><h6> Name</h6></td>
		<td> <h6>Address</h6></td>
		<td><h6>Ph no.</h6>
		<td><h6>E-mail</h6>
		<tr>
		<% 
    while(rs.next())
    {
    	String name=rs.getString(1);
    	String addr=rs.getString(2);
    	String phn=rs.getString(3);
    	String mail=rs.getString(7);
    	%>
    	<tr>
			<td> <%=name %> </td>
			<td> <%=addr %> </td>
			<td> <%=phn %> </td>
			<td> <%= mail %></td>
			</tr>
			
    	<%
    }
		%>
		</table>
		<a href="adminpage.jsp">Go back</a>
		<% 
    }
		catch(Exception e)	
    {
    	e.printStackTrace();
    }


%>

</body>
</html>