<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.sql.*" %>
    <%@ page import ="java.util.*" %>
    <%@ page import ="java.text.SimpleDateFormat"%>
    <%@ page import= "java.util.GregorianCalendar"%>
    <%@ page import="java.util.Date"%>
    <!DOCTYPE HTML>
<html>

<head>
  <title>Daily report</title>
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
        
        
        
        
        
        <h2>Daily Report</h2>
        <fieldset>
        <form action="Controller" method="post">
          <div class="form_settings">
            <p>&nbsp;</p>
             
             
              <b> <h6><span>
              <%
String email=session.getAttribute("id").toString();

String s2=request.getParameter("date");
Calendar mydate= new GregorianCalendar();
try{
	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(s2);
	mydate.setTime(date1);
}catch (Exception e)
{
	e.printStackTrace();
}
String OLD_FORMAT = "yyyy-MM-dd";
String NEW_FORMAT = "dd-MMM-yyyy";

// August 12, 2010
String oldDateString =s2;
String newDateString;
SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
Date d = sdf.parse(oldDateString);
sdf.applyPattern(NEW_FORMAT);
newDateString = sdf.format(d);
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	PreparedStatement ps=con.prepareStatement("select sum(amount),expensetype from expense_details where usermail=? and expdate=? group by expensetype");
	PreparedStatement ps1=con.prepareStatement("select sum(amount) from expense_details where usermail=? and expdate=?");
	ps.setString(1,email);
		ps.setString(2,newDateString);
		ps1.setString(1,email);
		ps1.setString(2,newDateString);
	ResultSet rs=ps.executeQuery();
	ResultSet rs1=ps1.executeQuery();
	
	boolean b=false;
	if(rs.next())
	{
		b=true;
		String type=rs.getString(2);
		int amount=rs.getInt(1);
		%>
		<table  border="1" style="width:300px">
		<tr>
		<td><h6> Expense Type</h6></td>
		<td> <h6>Amount</h6></td>
		<tr>
		<td><%= type %></td>
		<td><%=amount %></td>
		</tr>
		<%
		while(rs.next())
		{
			
			String type1=rs.getString(2);
			int amount1=rs.getInt(1);
			%>
			<tr>
			<td> <%=type1 %> </td>
			
			<td> <%= amount1 %></td>
			</tr>
			
			<% 
			
		}
		%>
		</table>
		<% 
	}
	if(b==false)
	{
		pageContext.forward("daily_error.jsp");
	}
	rs1.next();
	int amt=rs1.getInt(1);
	%>
	You have spent total <%=amt  %>/- on <%=newDateString %>
	<% 
}catch(Exception e)	
{
	e.printStackTrace();
}
%>	&nbsp;</span></h6>
          </b>          </div>
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
