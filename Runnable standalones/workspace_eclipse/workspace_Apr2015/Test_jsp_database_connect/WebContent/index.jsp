<%@page import="java.sql.*"%>
<%@page import="java.io.PrintWriter"%>

<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html" charset=UTF-8">
      <title> JSP page </title>
  </head>
  <body>
	<br><br>
	<form method="post" name="form">
	<table border="1">
            <tr><th> Name </th><th>Address</th><th>Contact no</th><th>Email</th><th><a href="GiveData.html">Insert Data</a></th></tr>
   <%
	Connection con=null;
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String driver="oracle.jdbc.driver.OracleDriver";
	Statement st;
	try{
	   Class.forName(driver);
	   con=DriverManager.getConnection(url,"scott","aloy123");
	   st=con.createStatement();
	   ResultSet rs=st.executeQuery("select * from project06_user");
   %>
   <%
	while(rs.next()){
		String id=rs.getString(1);
   %>
   <tr>
   <td><%=rs.getString(2)%></td>
   <td><%=rs.getString(3)%></td>
   <td><%=rs.getString(4)%></td>
   <td><%=rs.getString(5)%></td>
   <td><a href="edit.jsp?id=<%=id%>">Edit</a></td>
   <td><a href="delete.jsp?id=<%=rs.getString(1)%>">Delete</a></td>
   </tr>
<%
}  %>
<%
}
catch(Exception e){}
%>
</table>
</form>
</body>
</html>