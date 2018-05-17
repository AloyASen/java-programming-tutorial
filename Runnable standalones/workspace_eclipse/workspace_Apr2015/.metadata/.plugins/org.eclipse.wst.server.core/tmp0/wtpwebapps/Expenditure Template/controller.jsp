<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>reg</title>
</head>
<body>
<%
String name=request.getParameter("name");
String addr=request.getParameter("addr");
String phno=request.getParameter("phno");
String pass=request.getParameter("password");
String email=request.getParameter("email");
String s1=request.getParameter("monthlyexp");
int mexp=Integer.parseInt(s1);
String s2=request.getParameter("income");
int inc=Integer.parseInt(s2);
String e1=request.getParameter("expense1");
String e2=request.getParameter("expense2");
String e3=request.getParameter("expense3");
String e4=request.getParameter("expense4");
String e5=request.getParameter("expense5");
String e6=request.getParameter("expense6");
String e7=request.getParameter("expense7");
String e8=request.getParameter("expense8");
//String sn="sn1.nextval";
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santu1","santu1");
	PreparedStatement ps1=con.prepareStatement("insert into user_master values(?,?,?,?,?,?,?)");
	ps1.setString(1,name);
	ps1.setString(2,addr);
	ps1.setString(3,phno);
	ps1.setString(4,pass);
	ps1.setInt(5,mexp);
	ps1.setInt(6,inc );
	ps1.setString(7,email);
	int i=ps1.executeUpdate();
	
	PreparedStatement ps2=con.prepareStatement("insert into expenditure_master values(sn1.nextval,?,?,?,?,?,?,?,?,?)");
	//ps2.setString(1,sn);
	ps2.setString(1,e1);
	ps2.setString(2,e2);
	ps2.setString(3,e3);
	ps2.setString(4,e4);
	ps2.setString(5,e5);
	ps2.setString(6,e6);
	ps2.setString(7,e7);
	ps2.setString(8,e8);
	ps2.setString(9,email);
	int j=ps2.executeUpdate();
	
	if(i>0 && j>0)
	{
		pageContext.forward("welcome.jsp");
	}
	
}catch(Exception e)
{
	e.printStackTrace();
	pageContext.forward("error.jsp");
}



%>
</body>
</html>