<!DOCTYPE HTML>
<html>
<%@page session="false"%>
<head>
  <title>Welcome to Expense management Support</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
	<script type="text/javascript" src="js/backfix.min.js"></script>
	<script type="text/javascript">
	bajb_backdetect.OnBack = function()
	{
		windows.location.href='login.jsp';
	}




	
	</script>
	
	
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
      <%
      HttpSession session=request.getSession();
      %>
        <h1>Welcome to Expense tracker</h1>
        <p>It is a free web site which helps you to track tour daily expenses. We know it is not always possible to maintain a notebook and a pen with yourself to note down all your expenses at the time you are expending.So we are presenting a useful way to maintain your expenses with the help of a website. If you carry a mobile or a tablet computer with yourself then you can simply maintain your expenditure using our web site.</p>
        <p>In the age of Computers and all those electronic gadgets that can access internet you don not need any notebook and pencils or pens to record your expenses. you have reached the right place. Note your Expenses here with only some clicks and key pressings.</p>
        <p>It may happen that you lost your notebook where you maintained your expenses, then what will you do?You can not do anything. Your records are lost forever. So after joining us forget the worries about losing your expense data because your data is safe and secure in our database. </p>
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
