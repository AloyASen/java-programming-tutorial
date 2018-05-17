<!DOCTYPE HTML>
<html>

<head>
  <title>CSS3_abstract_bw</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
</head>

<body>
  
  <div id="main">
    <jsp:include page="header2.jsp"/>
    <div id="site_content">
      <div id="sidebar_container">
        <div class="sidebar">
          <h3>Latest News</h3>
          <h4>New Website Launched</h4>
          <h5>July 23rd, 2014</h5>
          <p>2014 sees the redesign of our website. <a href="news.html">Read more</a></p>
        </div>
        <div class="sidebar">
          <h3>Useful Links</h3>
          <ul>
            <li><a href="#">First Link</a></li>
            <li><a href="#">Another Link</a></li>
            <li><a href="#">And Another</a></li>
            <li><a href="#">Last One</a></li>
          </ul>
        </div>
        <div class="sidebar">
          <h3>More Useful Links</h3>
          <ul>
            <li><a href="#">First Link</a></li>
            <li><a href="#">Another Link</a></li>
            <li><a href="#">And Another</a></li>
            <li><a href="#">Last One</a></li>
          </ul>
        </div>
      </div>
      <div class="content">
      <h1>
        <p>Add Expense &darr; <hr/>
        </h1>
        
        </p>
        <form action="" >
       <p>
       	<input name="Add1" id="addE""text" size="70" placeholder="enter the description of expenditure" maxlength="50" />
       </p>
       <p>
       		<input name="Add2" type="text" placeholder="Enter the ammount of expenditure " size="40" maxlength="12" />
       </p>
       <p>
       		<input name="Add3" type="submit" value="Add " />
       </p>
       </form>
       <h1>
        <p>Edit Expense &darr; <hr/>
        </h1>
        <form action="" >
       <p>
       	<input name="Add1" id="EditE" type="text" size="70" placeholder="enter the description of expenditure" maxlength="50" />
       </p>
       <p>
       		<input name="Add2" id= type="text" placeholder="Enter the ammount of expenditure " size="40" maxlength="12" />
       </p>
       <p>
       		<input name="Add3" type="submit" value="Add " />
       </p>
       </form>
       
             </div>
             
    </div>
    
    <div id="scroll">
      <a title="Scroll to the top" class="top" href="#"><img src="images/top.png" alt="top" /></a>
    </div>
    
  </div>
  <!-- javascript at the bottom for fast page loading -->
  <script type="text/javascript" src="js/jquery.js"></script>
  <script type="text/javascript" src="js/jquery.easing-sooper.js"></script>
  <script type="text/javascript" src="js/jquery.sooperfish.js"></script>
  <script type="text/javascript">
    $(document).ready(function() {
      $('ul.sf-menu').sooperfish();
      $('.top').click(function() {$('html, body').animate({scrollTop:0}, 'fast'); return false;});
    });
  </script>
</body>
</html>
