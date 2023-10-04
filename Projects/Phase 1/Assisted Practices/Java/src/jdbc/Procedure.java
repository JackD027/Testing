package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Procedure {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password= "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		Statement stmt = con.createStatement();
		
		String query="Call allMovies()";
		
		ResultSet rs = stmt.executeQuery(query);
		
		//print the rows
		while(rs.next()) {
			System.out.print("Title:"+rs.getString("title")+" \t");
			System.out.print("Genre:"+rs.getString("genre")+" \t");
			System.out.print("Director:"+rs.getString("director")+" \t");
			System.out.print("Release Year:"+rs.getString("release_year")+" \t");
			
			System.out.println();
		}
		
		con.close();
		
	}

}
