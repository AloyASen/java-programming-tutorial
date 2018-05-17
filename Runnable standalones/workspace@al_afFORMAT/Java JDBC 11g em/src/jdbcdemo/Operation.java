package jdbcdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Operation {
	
	Connection c;
	
	{
		this.c=new Dbconfig().getConnected();
		/*Dbconfig d=new Dbconfig();
		this.c=d.getConnected();*/
	}
	
	public int insertValue(){
		
	int r=0;
	try {
		PreparedStatement ps=c.prepareStatement("insert into student_info values(?,?,?)");
		String name=JOptionPane.showInputDialog("Enter name");
		String email=JOptionPane.showInputDialog("Enter email");
		String add=JOptionPane.showInputDialog("Enter address");
		ps.setString(1, name);	
		ps.setString(2, email);	
		ps.setString(3, add);
		r=ps.executeUpdate();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	return r;
	}
	
	public ResultSet fetchAll(){
		ResultSet res=null;
		try{
		PreparedStatement ps=c.prepareStatement("select * from student_info");
		res=ps.executeQuery();
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return res;
	}
		
	public int update()
	{
		int r=0;
		try{
		String mail=JOptionPane.showInputDialog("Enter the mail which u want to update");
		String uadd=JOptionPane.showInputDialog("Enter the new address which u want to update");
		String uname=JOptionPane.showInputDialog("Enter the new name which u want to update");
		PreparedStatement ps=c.prepareStatement("update student_info set sname=?,sadd=? where smail=?");
		ps.setString(1, uname);
		ps.setString(2, uadd);
		ps.setString(3, mail);
		r=ps.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}
		return r;
	}
	
}
