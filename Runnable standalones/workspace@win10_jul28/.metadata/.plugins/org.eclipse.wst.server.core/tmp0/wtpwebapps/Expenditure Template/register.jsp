<!DOCTYPE HTML>
<html>

<head>
  <title>User's Registration</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="css/style.css" />
  <!-- modernizr enables HTML5 elements and feature detects -->
  <script type="text/javascript" src="js/modernizr-1.5.min.js"></script>
 <script type="text/javascript">
								function confirmPass() {
									var pass = document.getElementById("pass").value
									var confPass = document.getElementById("c_pass").value
									if(pass != confPass) {
										alert('Wrong confirm password !');
									}
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
      
      
      
      
      <!-- commented
      
        <h1>Examples</h1>
        <p>This page contains examples of all the styled elements available as part of this design. Use this page for reference, whilst you build your website.</p>
        <h2>Headings</h2>
        <p>These are the different heading formats:</p>
        <h1>Heading 1</h1>
        <h2>Heading 2</h2>
        <h3>Heading 3</h3>
        <h4>Heading 4</h4>
        <h5>Heading 5</h5>
        <h6>Heading 6</h6>
        <h2>Text</h2>
        <p>The following examples show how the text (within '&lt;p&gt;&lt;/p&gt;' tags) will appear:</p>
        <p><strong>This is an example of bold text</strong></p>
        <p><i>This is an example of italic text</i></p>
        <p><a href="#">This is a hyperlink</a></p>
        <h2>Lists</h2>
        <p>This is an unordered list:</p>
        <ul>
          <li>Item 1</li>
          <li>Item 2</li>
          <li>Item 3</li>
          <li>Item 4</li>
        </ul>
        <p>This is an ordered list:</p>
        <ol>
          <li>Item 1</li>
          <li>Item 2</li>
          <li>Item 3</li>
          <li>Item 4</li>
        </ol>
        <h2>Images</h2>
        <p>images can be placed on the left, in the center or on the right:</p>
        <span class="left"><img src="images/graphic.jpg" alt="example graphic" /></span>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
          exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
          irure dolor in reprehenderit in voluptate velit esse cillum.
        </p>
        <span class="center"><img src="images/graphic.jpg" alt="example graphic" /></span>
        <span class="right"><img src="images/graphic.jpg" alt="example graphic" /></span>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor
          incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
          exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute
          irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
          pariatur.
        </p>
        <h2>Tables</h2>
        <p>Tables should be used to display data and not used for laying out your website:</p>
        <table style="width:100%; border-spacing:0;">
          <tr><th>Item</th><th>Description</th></tr>
          <tr><td>Item 1</td><td>Description of Item 1</td></tr>
          <tr><td>Item 2</td><td>Description of Item 2</td></tr>
          <tr><td>Item 3</td><td>Description of Item 3</td></tr>
          <tr><td>Item 4</td><td>Description of Item 4</td></tr>
        </table> -->
        
        
        
        
        
        <h2>User's Registration</h2>
        <fieldset>
        <form name="register" action="controller.jsp" method="post">
          <div class="form_settings">
            <p><span>Name</span><input type="text" name="name" value="" required="required" /></p>
             <p><span>Address</span><textarea rows="8" cols="50" name="addr" required="required"></textarea></p>
             <p><span>Phone</span><input type="text" name="phno" value="" required="required"/></p>
             
             
              <b> <h6>Tick your expense Categories</h6></b><br/>
           <p><b><span>Bazar</span></b><input class="checkbox" type="checkbox" name="expense1" value="bazar" /></p>
            <p><b><span>Travel</span></b><input class="checkbox" type="checkbox" name="expense2" value="travel" /></p>
            <p><b><span>Grocery</span></b><input class="checkbox" type="checkbox" name="expense3" value="grocessary" /></p>
            <p><b><span>Garments</span></b><input class="checkbox" type="checkbox" name="expense4" value="garments" /></p>
            <p><b><span>Doctor/Medicine</span></b><input class="checkbox" type="checkbox" name="expense5" value="health" /></p>
              <p><b><span>Fixed expenses</span></b><input class="checkbox" type="checkbox" name="expense6" value="fixed" /></p>
                       <p><b><span>Accesseries</span></b><input class="checkbox" type="checkbox" name="expense7" value="accesseries" /></p>
             <p><b><span>Others</span></b><input class="checkbox" type="checkbox" name="expense8" value="others" /></p>
              
               <p><span>Password</span><input type="password" id="pass" name="password" value="" required="required"/></p>
                 <p><span>Confirm Password</span><input type="password" id="c_pass" name="conpassword" value="" onBlur="confirmPass()" required="required"/></p>
              <p><span>Email</span><input type="email" name="email" value="" required="required"/></p>
               <p><span>Monthly Estimated expense</span><input  type="text" name="monthlyexp" value="" required="required"/></p>
               <p><span>Monthly Income</span><input  type="text" name="income" value="" required="required"/></p>
              <!--   
           <p><span>Textarea example</span><textarea rows="8" cols="50" name="name"></textarea></p>
            <p><span>Checkbox example</span><input class="checkbox" type="checkbox" name="name" value="" /></p>-->
           <!--  <p><span>Dropdown list example</span><select id="id" name="name">
           <option value="1">Example 1</option>
           <option value="2">Example 2</option></select></p>-->
          
          
         
           
           
            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="b1" value="Register" /></p>
          </div>
        </form>
        </fieldset>
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
