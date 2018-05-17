package connect_11g_odbc_thin;
import java.sql.*;//step 1:import the required package
public class Database_url_PRIVATE {
	
	
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
