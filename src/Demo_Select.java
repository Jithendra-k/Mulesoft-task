import java.sql.*;

public class Demo_Select 
{
	public static void main(String args[])throws Exception
	{
		// load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// connection establishment
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","student");
		
		// creating the statement
		PreparedStatement  pstmt= con.prepareStatement("select * from Movies");
        
		//Result set
		ResultSet rs = pstmt.executeQuery();
        
		//reteiving details
		while (rs.next())
		{
			if(rs.getString(3).equals("shradha")) {
				System.out.println("Movie is = "+ rs.getString(1) + "\n" + "Lead actor = "+ rs.getString(2) + "\n" + "Lead actress = " + rs.getString(3) + "\n" + "year = " + rs.getString(4) + "\n" + "Director = " + rs.getString(5));
			}
		}
        // close the connection
     	con.close();
//		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
//                ResultSet.CONCUR_READ_ONLY);
//		
//		ResultSet rs = st.executeQuery("select * from patients");
//		System.out.println();
			
			
			
	
	}
}