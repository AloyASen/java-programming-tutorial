/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connector;

import java.sql.*;

/**
 *
 * @author Aloy Sen
 */
public class Dbconfig {
	
	
	//step 2:define the credentials
	private final String uname="SCOTT";
	private final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	private final String pass="aloy123";
	private final String drivername="oracle.jdbc.driver.OracleDriver";
	Connection con;
	public Connection getConnected(){
		
		try {
			Class.forName(drivername);// throws ClassNotfoundException
			this.con=DriverManager.getConnection(url, uname, pass);// throws SQLException
			System.out.println("connected");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
		
		
	}
}