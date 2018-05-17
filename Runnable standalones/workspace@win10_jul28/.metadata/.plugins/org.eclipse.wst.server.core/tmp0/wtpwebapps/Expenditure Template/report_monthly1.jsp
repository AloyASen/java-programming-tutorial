<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
    <!DOCTYPE HTML>
<html>
<%@page session="false"%>
<head>
  <title>monthly report</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
   <jsp:include page="header_user.jsp"/>
    <div id="site_content">
       <jsp:include page="photoes.jsp"/>
      <div id="sidebar_container">
        <div class="sidebar">
       
         <jsp:include page="notice.jsp"/>
        </div>
      </div>
      <div class="content">
      <%
      HttpSession session=request.getSession();
      %>
      
      <% 
      String email=session.getAttribute("id").toString();
      String month=request.getParameter("month");
      try{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
    		PreparedStatement ps=con.prepareStatement("select sum(amount),expensetype from expense_details where usermail=? and month=? group by expensetype");
    		PreparedStatement ps1=con.prepareStatement("select sum(amount) from expense_details where usermail=? and month=?");
    		ps.setString(1,email);
    			ps.setString(2,month);
    			ps1.setString(1,email);
    			ps1.setString(2,month);
    		ResultSet rs=ps.executeQuery();
    		ResultSet rs1=ps1.executeQuery();
    		boolean b=false;
    		if(rs.next())
    		{
    			b=true;
    			String type=rs.getString(2);
    			int amount=rs.getInt(1);
    			%>
    			<h2>Monthly report</h2>
						<table  border="1" style="width:300px">
		<tr>
		<td><h6> Expense Type</h6></td>
		<td> <h6>Amount</h6></td>
		<tr>
		<td><%= type %></td>
		<td><%=amount %></td>
		</tr>
		
		<%
		while(rs.next())
		{
			
			String type1=rs.getString(2);
			int amount1=rs.getInt(1);
			%>
			
			<tr>
			<td> <%=type1 %> </td>
			
			<td> <%= amount1 %></td>
			</tr>
			
		<% 
		}
		%>
		</table>
		<%
    		}
    		
	
	if(b==false)
	{
		pageContext.forward("monthly_error.jsp");
	}
	rs1.next();
	int amt=rs1.getInt(1);
	%>
	<p style="font-size:20px">You have spent total <%=amt %>/- in <%=month %></p>
	<% 
 }
	catch(Exception e)	
{
	e.printStackTrace();
}      
      
      
      
      
      
      
      
      %>
        
        
      </div>
    </div>
   <jsp:include page="footer.jsp"/>
  </div>
  <p>&nbsp;</p>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript" src="js/jquery.kwicks-1.5.1.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('#images').kwicks({
        max : 600,
        spacing : 2
      });
      $('ul.sf-menu').sooperfish();
    });
  </script>
</body>
</html>
