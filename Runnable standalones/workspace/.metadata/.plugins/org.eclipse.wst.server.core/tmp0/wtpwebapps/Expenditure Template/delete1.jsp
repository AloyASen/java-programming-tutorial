<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
<!DOCTYPE HTML>

<html>

<head>
  <title>admin delete</title>
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
