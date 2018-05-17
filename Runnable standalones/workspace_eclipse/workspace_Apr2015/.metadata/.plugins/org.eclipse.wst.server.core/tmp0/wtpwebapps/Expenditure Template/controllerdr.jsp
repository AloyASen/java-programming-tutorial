<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
    <%@ page import ="java.util.*" %>
    <%@ page import ="java.text.SimpleDateFormat"%>
    <%@ page import= "java.util.GregorianCalendar"%>
    <%@ page import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>daily report</title>
</head>
<body>
<%
String email=session.getAttribute("id").toString();

String s2=request.getParameter("date");
Calendar mydate= new GregorianCalendar();
try{
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(s2);
	mydate.setTime(date1);
}catch (Exception e)
{
	e.printStackTrace();
}
String OLD_FORMAT = "yyyy-MM-dd";
String NEW_FORMAT = "dd-MMM-yyyy";

// August 12, 2010
String oldDateString =s2;
String newDateString;
SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
Date d = sdf.parse(oldDateString);
sdf.applyPattern(NEW_FORMAT);
newDateString = sdf.format(d);
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santu1","santu1");
	PreparedStatement ps=con.prepareStatement("select sum(amount),expensetype from expense_details where usermail=? and expdate=? group by expensetype");
	ps.setString(1,email);
		ps.setString(2,newDateString);
	ResultSet rs=ps.executeQuery();
	boolean b=false;
	if(rs.next())
	{
		String type=rs.getString(2);
		int amount=rs.getInt(1);
		%>
		<%=type %>
		<br>
		<%= amount %>
		<br>
		<%
		while(rs.next())
		{
			
			String type1=rs.getString(2);
			int amount1=rs.getInt(1);
			%>
			<br>
			<%=type1 %>
			<br>
			<%= amount1 %>
			<br>
			<%
		}
	}
}catch(Exception e)	
{
	e.printStackTrace();
}
%>	
</body>
</html>