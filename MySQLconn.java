import java.sql.*;


public class MySQLconn
{
	public static void main(String args[])
	{

	}

	public Connection getConnection()
	{
		Connection conn=null;

	// Set up database connection
	try {
		 Class.forName("com.mysql.jdbc.Driver").newInstance();
         conn= DriverManager.getConnection(
	  "jdbc:mysql://localhost/flight?user=root&password=sqlserver");
	

      }
      catch ( ClassNotFoundException cnfex ) {
         // process ClassNotFoundExceptions here
         cnfex.printStackTrace();

      }
      catch ( SQLException sqlex ) {
         // process SQLExceptions here
         sqlex.printStackTrace();

      }
      catch ( Exception excp ) {
         // process remaining Exceptions here
         excp.printStackTrace();

      }

      return conn;
   }


}