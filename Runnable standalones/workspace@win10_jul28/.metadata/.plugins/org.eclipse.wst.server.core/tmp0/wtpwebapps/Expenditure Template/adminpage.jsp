<!DOCTYPE HTML>
<html>

<head>
  <title>Welcome admin</title>
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
      
      
      
      
     
        
        
        
        
        
<h1>Welcome admin</h1>

<br>
<hr>
<br>
<br>
<a href="count.jsp"><b>View total no of user</b></a>
<br>

<br>
<a href="show.jsp"><b>Show all users</b></a>
<br>

<br>

<a href="delete.jsp"><b>Click to Delete a user</b></a>
<br>

<br>
<a href="logout1.jsp"><b>Log out</b></a>

          <div class="form_settings">
            <p style="padding-top: 15px"><span>&nbsp;</span></p>
          </div>
        
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
