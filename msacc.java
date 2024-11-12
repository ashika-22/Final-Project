import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
 
public class msacc {
 
    public static void main(String[] args) {
 
       
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
		PreparedStatement ps = null;
 
     
     
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in loading"
                    + " MS Access JDBC driver");
            cnfex.printStackTrace();
        }
 
       
        try {
 
            String msAccessDBName = "F:\\ashika\\Student\\Player1.accdb";
            String dbURL = "jdbc:odbc:Driver="
                    + "{Microsoft Access Driver (*.mdb, *.accdb)};"
                    + "DBQ="
                    + msAccessDBName
                    + ";DriverID=22;READONLY=true";
 
                       connection = DriverManager.getConnection(dbURL);
  statement = connection.createStatement();
         

  String sql = "INSERT INTO Player(ID,Name,Age,Matches) VALUES (?,?,?,?)";
             //String sql = "DELETE FROM Player where Name='Virat'";
   ps = connection.prepareStatement(sql);
            statement= connection.createStatement();

            ps.setInt(1,8);
            ps.setString(2,"Virat kolli");
			ps.setInt(3, 30);
			ps.setInt(4, 200);
            ps.executeUpdate();

           
            
     
 
           
            resultSet = statement
                    .executeQuery("SELECT * FROM Player");
 
            System.out.println("ID\tName\t\t\tAge\tMatches");
            System.out.println("==\t================\t===\t=======");
 
         
            while(resultSet.next())
   {
                System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2)+"\t\t"+resultSet.getInt(3)+"\t"+resultSet.getInt(4));
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
           
            try {
                if(null != connection) {
 
                   
                    resultSet.close();
                    statement.close();
 
                   
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
}
