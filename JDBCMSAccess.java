import java.sql.Connection;
import java.sql.DriverManager;
 
public class JDBCMSAccess {
	public static void main(String args[]){
		//location where database is present in the system
		//String database = "D:\\Users\\TCP\\Documents\\Database1.accdb";
String database ="F:\\ashika\\Student\\stu.mdb";


		
		try {
				//loading the driver class
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	
				//creating connection string
				String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + database;
	
				//establishing connection
				Connection con = DriverManager.getConnection(url);
	
				if(con!=null){
					System.out.println("Connection Successful!");
					con.close();
				}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}