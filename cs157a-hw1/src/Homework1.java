
import java.sql.*;
class Homework1{
	
public static void main(String args[]){ 
	try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cs157a?serverTimezone=UTC","root","57575Han");
//here cs157a is database name, root is username and password 
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from cs157a");
while(rs.next())
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)); con.close();
}catch(Exception e)
	{ 
		System.out.println(e);}
	}
}