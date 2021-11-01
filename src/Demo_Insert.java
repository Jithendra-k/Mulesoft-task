/* JDBC Demo for Inserting into Table */
import java.sql.*;

public class Demo_Insert 
{
	public static void main(String[] args) 
    {	try
		{
    		Class.forName("oracle.jdbc.driver.OracleDriver");
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "student","student");
    		PreparedStatement pstmt=con.prepareStatement("insert into Movies values(?,?,?,?,?)");
    		pstmt.setString(1, "Sahoo");
    		pstmt.setString(2, "Prabhas");    			
    		pstmt.setString(3, "shradha");
    		pstmt.setString(4, "2021");
    		pstmt.setString(5, "sujeet");
    		boolean n = pstmt.execute();   			
    		//System.out.println("return value = "+ n);
    		if(n)
    			System.out.println("- - - - One Record inserted successful - - - -");
    		else
    			System.out.println("- - - - One Record inserted successful - - - -");
		}
		catch(ClassNotFoundException | SQLException e)
		{		
			System.out.println(e);  
		}
	}
}