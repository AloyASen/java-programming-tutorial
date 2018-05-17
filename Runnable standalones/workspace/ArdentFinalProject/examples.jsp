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
  <table width="200">
    <tr>
      <td><label>
        <input type="checkbox" name="CheckboxGroup1" value="Food" id="CheckboxGroup1_0" />
        Food</label></td>
    </tr>
    <tr>
      <td><label>
        <input type="checkbox" name="CheckboxGroup1" value="Clothing" id="CheckboxGroup1_1" />
        Clothing</label></td>
    </tr>
    <tr>
      <td><label>
        <input type="checkbox" name="CheckboxGroup1" value="Travel" id="CheckboxGroup1_2" />
        Travel</label></td>
    </tr>
    <tr>
      <td><label>
        <input type="checkbox" name="CheckboxGroup1" value="Payment" id="CheckboxGroup1_3" />
        Payment</label></td>
    </tr>
    <tr>
      <td><label>
        <input type="checkbox" name="CheckboxGroup1" value="others" id="CheckboxGroup1_4" />
        others</label></td>
    </tr>
  </table>
  <div id="main">
    <jsp:include page="header.jsp"/>
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
<!--        <h1>Examples.manage</h1>
-->        <h1>Register to us</h1>
			<h6>&copy; protected&trade;</h6>
    <form action="" method="post" enctype="multipart/form-data" name="form1" id="form1"> 
 <!--<marquee behavior="alternate"> <center>Registration Form</center></marquee>-->
  <table width="447" border="1" align="center">
    <tr>
      <td width="126">First Name</td>
      <td width="305"><label for="textfield"></label>
      <input name="textfield" type="text" id="textfield" value="Enter a First Name" maxlength="6" /></td>
    </tr>
    <tr>
      <td>Last Name</td>
      <td><label for="textfield2"></label>
      <input name="textfield2" type="text" id="textfield2" value="Enter a Last Name" maxlength="8" /></td>
    </tr>
    <tr>
      <td>Email-id</td>
      <td><label for="textfield3"></label>
      <input name="textfield3" type="text" id="textfield3" value="Enter a Email-Id" maxlength="23" /></td>
    </tr>
    <tr>
      <td>Password</td>
      <td><label for="textfield4"></label>
      <input name="textfield4" type="password" id="textfield4" value="Enter a Password" maxlength="10" /></td>
    </tr>
    <tr>
      <td>Re-Type Password</td>
      <td><label for="textfield5"></label>
      <input name="textfield5" type="password" id="textfield5" value="Enter a Re-Type Password" maxlength="10" /></td>
    </tr>
    <tr>
      <td>D.O.B</td>
      <td>
      DAY
      <select name="name">
     
      <script type="text/javascript">
	  for(var i=1;i<=31;i++){
	  document.write("<option value="+i+">"+i+"</option>");
	  }
	  </script>
      </select>
      
      MONTH
      <select name="month">
     
      <script type="text/javascript">
	  for(var i=1;i<=12;i++){
	  document.write("<option value="+i+">"+i+"</option>");
	  }
	  </script>
      </select>
      
       YEAR
      <select name="month">
     
      <script type="text/javascript">
	  for(var i=1950;i<=2050;i++){
	  document.write("<option value="+i+">"+i+"</option>");
	  }
	  </script>
      </select>
      
      </td>
    </tr>
    <tr>
      <td>Address</td>
      <td><label for="textarea"></label>
      <textarea name="textarea" id="textarea" cols="30" rows="5"></textarea></td>
    </tr>
    <tr>
      <td>Sex</td>
      <td><p> 
        <input name="radio" type="radio" id="radio" value="radio" />
        <label for="radio"></label>
        Male 
        
      </p>
      <p>
        <input type="radio" name="radio2" id="radio2" value="radio2" />
        <label for="radio2"></label>
      Female</p></td>
    </tr>
    <tr>
    	<td>Type of expense
        </td>
        	
        <td>
        		<p>
                	<input type="checkbox" name="food" value="food" /><label for="food"></label>
                    Food
                </p>
                <p>
                	<input type="checkbox" name="Travel" value="Travel" /><label for="Travel"></label>
                    Travel
                </p>
                <p>
                	<input type="checkbox" name="Payment" value="Payment" /><label for="Payment"></label>
                    Payment
                </p>
                <p>
                	<input type="checkbox" name="clothing" value="clothing" /><label for="clothing"></label>
                    clothing
                </p>
                <p>
                	<input type="checkbox" name="others" value="others" /><label for="others"></label>
                    others
                </p>
        </td>
    </tr>
    <tr>
      <td><input type="submit" name="." id="." value="Submit" /></td>
      <td><input type="submit" name="button" id="button" value="Reset" /></td>
    </tr>
  </table>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
</form>
        <!--<p>This page contains examples of all the styled elements available as part of this design. Use this page for reference, whilst you build your website.</p>
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
        </table>
        <h2>Form Elements</h2>
        <form action="#" method="post">
          <div class="form_settings">
            <p><span>Form field example</span><input type="text" name="name" value="" /></p>
            <p><span>Textarea example</span><textarea rows="8" cols="50" name="name"></textarea></p>
            <p><span>Checkbox example</span><input class="checkbox" type="checkbox" name="name" value="" /></p>
            <p><span>Dropdown list example</span><select id="id" name="name"><option value="1">Example 1</option><option value="2">Example 2</option></select></p>
            <p style="padding-top: 15px"><span>&nbsp;</span><input class="submit" type="submit" name="name" value="button" /></p>-->
          </div>
        
      </div>
    </div>
    <div id="scroll">
      <a title="Scroll to the top" class="top" href="#"><img src="images/top.png" alt="top" /></a>
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
