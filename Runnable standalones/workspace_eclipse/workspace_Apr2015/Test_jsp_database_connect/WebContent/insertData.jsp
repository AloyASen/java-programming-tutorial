<%-- 
    Document   : insertData
    Created on : 31 May, 2015, 3:45:05 PM
    Author     : MOUSITA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Data Page</title>
    </head>
    <body>
        <%@page import="java.sql.*"%>
        <%
        String id=request.getParameter("txtId");
        String name=request.getParameter("txtName");
        String address=request.getParameter("txtAddress");
        String phno=request.getParameter("txtPhNo");
        String email=request.getParameter("txtEmail");
        try{
	     Connection conn=null;
             PreparedStatement st=null;
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","aloy123");
             String queryString="Insert into project06_user values('"+id+"','"+name+"','"+address+"','"+phno+"','"+email+"')";
             st=conn.prepareStatement(queryString);
            int i= st.executeUpdate();
	//st.executeUpdate("update employee set name='"+name+"',address='"+address+"',contact_no='"+contact+"',email='"+email+"' where id='"+ide+"'");
	if(i>0)
            response.sendRedirect("displayUpdate.jsp");
        else
           response.sendRedirect("GiveData.html"); 
    }
    catch(Exception e){
		System.out.println(e);
	}
        %>
    </body>
</html>