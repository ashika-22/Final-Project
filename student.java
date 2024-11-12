import java.sql.*;  
class student
{  
public static void main(String args[])
{  
//loading the driver
try{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
}
catch(ClassNotFoundException e)
{
	System.out.println("Problem in loading"+"MS Access JDBC Driver");
	e.printStackTrace();
}
//opening database connection
String database;
String url;
Connection c;
Statement st;
ResultSet rs;
try
	{
		database="F:\\ashika\\Student\\stu.mdb";
		url="jdbc:odbc:Driver="
		+"{Microsoft Access Driver (*.mdb, *.accdb)};"
		+"DBQ="
		+ database
		+";DriverID=22;READONLY=true";
//create and get connection using driver managerclass
		c=DriverManager.getConnection(url);  
		st=c.createStatement();  
//executing sql and retrive data into ResultSet
		rs=st.executeQuery("INSERT INTO stu1(regno,name,place)VALUES('123','ashika','Chennai')");  
		while(rs.next())
		{  
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"/t"+rs.getString(3));  
		}  
	}
	catch(Exception ee)
	{
		System.out.println("no values are inserted");
		ee.printStackTrace();
	}  
//closing the database
finally
{
	try
	{
		if(c!=null)
		{
			rs.close();
			st.close();
			c.close();
		}
	}
	catch(SQLException eee)
	{
		eee.printStackTrace();
	}
}
}
  
} 