import java.sql.*; 
import java.sql.DriverManager; 
class Test{  
public static void main(String ar[]){ 
String database ="F:\\ashika\\Student\\stu.mdb"; 
 try{ 
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	String url="jdbc:odbc:={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + database;   
	Connection c=DriverManager.getConnection(url);  
	Statement st=c.createStatement();  
	ResultSet rs=st.executeQuery("INSERT INTO stu1(regno,name,place)VALUES(123,ashika,Chennai)");  
    
   while(rs.next())
   {  
    System.out.println(rs.getString(1));  
   }  
  
}
catch(Exception ee){System.out.println(ee);}  
  
}
}  