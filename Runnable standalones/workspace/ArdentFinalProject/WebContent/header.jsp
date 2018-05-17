<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>

<body>

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
            <li><a href="index.jsp">Home</a></li>
            <li><a href="examples.jsp">Register</a></li>
<!--            <li><a href="page.jsp">Configure</a></li>
-->            <li><a href="another_page.jsp">Forum</a></li>
            <li><a href="#">Profile</a>
              <ul>
                <li><a href="login.jsp">Login</a></li>
                <li><a href="page.jsp">Add expense type</a>
                  <ul>
                    <li><a href="page.jsp">Domestic</a></li>
                    <li><a href="page.jsp" >Commercial</a></li>
                    
                  </ul>
                </li>
                <li><a href="manage.jsp">Configure</a></li>
               
                <li><a href="#">Logout</a></li>
              </ul>
            </li>
            <li><a href="contact.jsp">Contact Us</a></li>
          </ul>
        </div>
      </nav>
    </header>
</body>
</html>