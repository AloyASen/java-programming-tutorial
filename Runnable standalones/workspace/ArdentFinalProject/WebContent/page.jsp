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
    <jsp:include page="header.jsp"/>
    <div id="site_content">
      <div id="sidebar_container">
        <div class="sidebar">
          <h3>Latest News</h3>
          <h4>New Website Launched</h4>
          <h5>July 23rd, 2014</h5>
          <p>2014 sees the redesign of our website. <a href="news.jsp">Read more</a></p>
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
        <h1 style="font:'Palatino Linotype', 'Book Antiqua', Palatino, serif">Set the type of expenses made</h1>
        <p>
        <h3>Domestic :&darr;</h3>
             </p>
             <p>
             <hr />
             <form id="form1" name="form1" method="get" action="">
    <p>
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Food" id="CheckboxGroup1_0" />
        Food</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Clothing" id="CheckboxGroup1_1" />
        Clothing</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Travel" id="CheckboxGroup1_2" />
        Travel</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Payment" id="CheckboxGroup1_3" />
        Payment</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Others" id="CheckboxGroup1_4" />
        others...</label>
      <br />
    </p>
  </form>
             </p>
             
        <p>
        <h3>Commercial :&darr;</h3>
             </p>
             <p>
             <hr />
             <form id="form1" name="form1" method="get" action="">
    <p>
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Food" id="CheckboxGroup1_0" />
        Food</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Clothing" id="CheckboxGroup1_1" />
        Clothing</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Travel" id="CheckboxGroup1_2" />
        Travel</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Payment" id="CheckboxGroup1_3" />
        Payment</label>
      <br />
      <label>
        <input type="checkbox" name="CheckboxGroup1" value="Others" id="CheckboxGroup1_4" />
        others...</label>
      <br />
    </p>
  </form>
             </p>
             </div>
             
    </div>
    
    <div id="scroll">
      <a title="Scroll to the top" class="top" href="#"><img src="images/top.png" alt="top" /></a>
    </div>
    
  </div>
  <jsp:include page="footer.jsp"/>
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
