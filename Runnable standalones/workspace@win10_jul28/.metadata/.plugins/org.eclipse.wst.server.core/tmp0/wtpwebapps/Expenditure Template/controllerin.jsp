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
<title>Insert</title>
</head>
<body>
<%

	try{
		
String email=session.getAttribute("id").toString();
String s1=request.getParameter("amt");
int amt=Integer.parseInt(s1);
String type=request.getParameter("select");
String detail=request.getParameter("detail");
String s2=request.getParameter("date");
Calendar mydate= new GregorianCalendar();
try{
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(s2);
	mydate.setTime(date1);
}catch (Exception e)
{
	e.printStackTrace();
	pageContext.forward("error.jsp");
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

int i=mydate.get(Calendar.MONTH);
int j=i+1;
String monthString="";
switch(j){


case 1:  monthString = "January";
break;
case 2:  monthString = "February";
break;
case 3:  monthString = "March";
break;
case 4:  monthString = "April";
break;
case 5:  monthString = "May";
break;
case 6:  monthString = "June";
break;
case 7:  monthString = "July";
break;
case 8:  monthString = "August";
break;
case 9:  monthString = "September";
break;
case 10: monthString = "October";
break;
case 11: monthString = "November";
break;
case 12: monthString = "December";
break;
}
int k=mydate.get(Calendar.YEAR);

try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santu1","santu1");
	PreparedStatement ps=con.prepareStatement("insert into expense_details values(sn2.nextval,?,?,?,?,?,?,?)");
	//ps.setString(1,"sn2.nextval");
	ps.setString(1,type);
	ps.setInt(2,amt);
	ps.setString(3,newDateString);
	ps.setString(4, monthString);
	ps.setInt(5,k);
	ps.setString(6,detail);
	ps.setString(7,email);
	int u=ps.executeUpdate();
	if(u>0)
	{
		pageContext.forward("entrysuc.jsp");
	}
}
	
	catch(Exception e){
		e.printStackTrace();
		pageContext.forward("errorent.jsp");
	}
	}catch(Exception e)
	{
		pageContext.forward("errordb.jsp");
	}

%>

</body>
</html>