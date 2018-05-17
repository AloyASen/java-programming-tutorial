package Jdbc_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Config {
	Connection con;

	
	
	private final String drivername="sun.jdbc.odbc.JdbcOdbcDriver";
	
	public ArrayList submitExpense(String email){
		ResultSet rs=null;
		ArrayList<String> aa=new ArrayList<>();
		
		try {
			try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.con=DriverManager.getConnection("jdbc:odbc:Database1");
			PreparedStatement ps=con.prepareStatement("select * from aloydb_test1 ");
			ps.setString(1,email);
			rs=ps.executeQuery(); 
			rs.next();
			for(int j=2;j<10;j++){
				if(rs.getString(j)!=null)
					aa.add(rs.getString(j));
			
			
			}
			for(int i=0;i<aa.size();i++)
				System.out.println(aa.get(i));
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return aa;
	}

}
