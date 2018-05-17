
import java.sql.*;//step 1:import the required package
public class Dbconfig {
	
	
	//step 2:define the credentials
	private final String uname="sys";
	private final String url="jdbc:oracle:thin:@localhost:1521:sen121962";
	private final String pass="aloy";
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
