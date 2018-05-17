<%@ page import = "java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
String email=session.getAttribute("id").toString();
String date=session.getAttribute("date").toString();
String type=session.getAttribute("type").toString();
String s1=request.getParameter("up_amt");
int amount=Integer.parseInt(s1);
String details=request.getParameter("up_det");
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DATASHOP","1234");
	PreparedStatement ps=con.prepareStatement("update expense_details set amount=?,details=? where usermail=? and expdate=? and expensetype=?");
	ps.setInt(1,amount);
	ps.setString(2,details);
	ps.setString(3,email);
	ps.setString(4,date);
	ps.setString(5,type);
	int i=ps.executeUpdate();
	if(i>0)
	{
		pageContext.forward("edit_suc.jsp");
	}
}
catch(Exception e)
{
	e.printStackTrace();
}
}
catch(Exception e)
{
	pageContext.forward("errordb.jsp");
}
%>
</body>
</html>