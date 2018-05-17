<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>

<!DOCTYPE HTML>
<html>

<head>
  <title>Show</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
   <jsp:include page="admin_header.jsp"/>
    <div id="site_content">
      <jsp:include page="photoes.jsp"/>
      <div id="sidebar_container">
        <div class="sidebar">
         <jsp:include page="notice.jsp"/>
        </div>
      </div>
      <div class="content">
      
      <%
String email=request.getParameter("email");
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","DATASHOP","1234");
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
      
      
      
     
        
        
        
        
        
        
        
        <form action="Controller" method="post">
          <div class="form_settings">
            <p style="padding-top: 15px"><span>&nbsp;</span></p>
          </div>
        </form>
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
