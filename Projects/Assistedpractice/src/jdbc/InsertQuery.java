package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String query= "INSERT INTO movies VALUE('Inside Out', 'Comedy', 'Pete Doctor', 2015)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password= "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		String title="new movie";
		String genre="new genre";
		String director="new director";
		String release_year="2000";
		
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)");
		
		ps.setString(1,title);
		ps.setString(2,genre);
		ps.setString(3,director);
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		
		System.out.println("Data inserted");
	}

}
