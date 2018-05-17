<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>

<!DOCTYPE HTML>
<html>

<head>
  <title>Count</title>
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
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","santu1","santu1");
	PreparedStatement ps=con.prepareStatement("select count(distinct email) from user_master ");
	
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
	int no=rs.getInt(1);
%>
<br>
<br>
<br>
<br>
<b>Currently we have</b> &nbsp;  <%=no %>  &nbsp;<b>registered users</b>
<br>
<br>
<a href="adminpage.jsp">Go back</a>
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
