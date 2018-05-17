<!DOCTYPE HTML>
<html>
<%@page session="false"%>
<head>
  <title>About us</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  <div id="main">
   <jsp:include page="header.jsp"/>
    <div id="site_content">
       <jsp:include page="photoes.jsp"/>
      <div id="sidebar_container">
        <div class="sidebar">
       
         <jsp:include page="notice.jsp"/>
        </div>
      </div>
      <div class="content">
        <p>
          <%
      HttpSession session=request.getSession();
      %>
      This website is developed by Soumyabrata ray,Subhajit Mitra,Avijit biswas,Raktim Talukder and Subhasis dalai. All of us are students of RCC Institute Of Information Technology. This is developed during the period of June,2014-July,2014.</p>
        <p>The software was inspired by the need of it when an alternate of excel or copy-pen was searched and none of the web-app was easy, cross-device compatible or even had that simple reporting technique. The web-app was tested and enhanced as per the requirements and if you think something is missing you too can suggest us(see contact us).</p>
        <p>&nbsp;</p>
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
