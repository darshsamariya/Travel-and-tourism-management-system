package travel.management.system;
import java.sql.*;
import java.sql.DriverManager;
public class conn {
	Connection c;
	Statement s;
	public conn()
	{
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");  //regsiter driver
	c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","5900"); //create connection
	s=c.createStatement(); //create state
	
}
catch(Exception e)
{
	
}
}
}
