<!DOCTYPE HTML>
<html>
<%@page session="false"%>
<head>
  <title>Welcome to Expense management t</title>
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
      <% String email=request.getParameter("mail"); %>
        <h1>Welcome to Expence tracker</h1>
        <p>Hello <%= email %></p>
        
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
