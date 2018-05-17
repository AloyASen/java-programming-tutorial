<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script type='text/javascript'>
 function parseTest() {
  var elem_1 = (page.jsp).getElementById('addE');
  var elem_2 = (page.jsp).getElementById('EditE');

  var inp_1 = elem_1.value;
  var inp_2 = elem_2.value;

  if (inp_1 == "" && inp_2 == "") {
   alert("You need to enter integers!!!");
   elem_1.focus();
  }else if (inp_1 == ""){
   alert("You need to enter Integer 1!!!");
   elem_1.focus();
  }else if (inp_2 == ""){
   alert("You need to enter Integer 2!!!");
   elem_2.focus();
  }else {
   if (!parseInt(inp_1) || !parseInt(inp_2)) alert ("Enter Integers only!!!");
   else alert("Correct Inputs!!!");
  } 
 }
</script>
</head>

<body>
<header>
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1><a href="index.jsp">EXPENSE<span class="logo_colour"> tracker(&beta;)</span></a></h1>
          <h2>Manage. Create. Report.</h2>
        </div>
      </div>
      <nav>
        <div id="menu_container">
          <ul class="sf-menu" id="nav">
            
            
<!--            <li><a href="page.jsp">Configure</a></li>
-->            
            <li><a href="#">Expense</a>
              <ul>
                <li><a onclick="parseTest(); return false;">Add</a></li>
                <li><a onclick="parseTest(); return false;">Edit</a>
                 
                </li>
                
                </ul>
            </li>
            <li><a href="#">Report</a>
              <ul>
                <li><a href="examples.jsp">Today's</a></li>
                <li><a href="expense.jsp">Monthly</a>
                 
                </li>
                <li><a href="expense.jsp">Yearly</a>
                 
                </li>
                
                </ul>
            </li>
            <li><a href="#">Profile</a>
              <ul>
                <li><a href="Profile.jsp">View Profile</a></li>
                <li><a href="expense.jsp">Edit Profile</a>
                 
                </li>
                
                </ul>
            </li>
            
            <li><a href="contact.jsp">Logout</a></li>
          </ul>
        </div>
      </nav>
    </header>
</body>
</html>