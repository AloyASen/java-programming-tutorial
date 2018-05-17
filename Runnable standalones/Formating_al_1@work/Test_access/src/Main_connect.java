/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;
import java.io.*;
/**
 *
 * @author SOMEN
 */
public class Main_connect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        try{        
           
       String name="akash";
       int age=22;
       
       int sal=60000;
        String sql1="Insert into members(first_name,email,password)Values('"+name+"',"+age+","+sal+")";

                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con=DriverManager.getConnection("jdbc:odbc:soumen");
                Statement s=con.createStatement();
                s.executeUpdate(sql1);
                
                
               // Connection con1=DriverManager.getConnection("jdbc:odbc:barber");
                Statement s1=con.createStatement();
                ResultSet rs=s1.executeQuery("select * from members");
               // c=rs.getFetchSize();
                //System.out.println("Size:"+c);
                while(rs.next())
                {
                    
                    System.out.println("name:"+rs.getString(1)+"Age:"+rs.getInt("age")+"Sal:"+rs.getInt("sal"));
                    System.out.println("inserted successfully");
                }
                con.close();
                
        }
        // TODO code application logic here
        catch(ClassNotFoundException e)
        {
          System.out.println(e.getMessage());
        } // TODO code application logic here
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    }


