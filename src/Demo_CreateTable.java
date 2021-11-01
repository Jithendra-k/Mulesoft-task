import java.sql.*;
import java.util.*;

public class Demo_CreateTable
{
	public static void main(String args[])throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
		Statement stmt= con.createStatement();
		String qry ="create table Movies(Movie varchar2(10),actor varchar2(10),actress varchar2(10),year varchar2(10),director varchar2(10))";
		int r= stmt.executeUpdate(qry);
		System.out.println("Table created successfully..............");
	}
}