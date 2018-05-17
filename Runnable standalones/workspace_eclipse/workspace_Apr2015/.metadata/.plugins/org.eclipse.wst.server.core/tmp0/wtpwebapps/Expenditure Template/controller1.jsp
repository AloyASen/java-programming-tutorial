<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<%
String email=request.getParameter("username");
String pass=request.getParameter("password");

if (email.equals("admin") && pass.equals("root")) 
{

pageContext.forward("adminpage.jsp");

}
else
{

 
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santu1","santu1");
	PreparedStatement ps=con.prepareStatement("select * from user_master where email=? and password=?");
	ps.setString(1,email);
	ps.setString(2,pass);
	ResultSet rs=ps.executeQuery();
	boolean b=false;
	if(rs.next())
	{
		b=true;
	}
	
	if(b==true)
	{
		pageContext.forward("user_index.jsp");
		session.setAttribute("id",email);
	}
	else
	{
		pageContext.forward("error1.jsp");
	}
}catch(Exception e)
{
	e.printStackTrace();
	pageContext.forward("errordb.jsp");
}

}

%>
</body>
</html>