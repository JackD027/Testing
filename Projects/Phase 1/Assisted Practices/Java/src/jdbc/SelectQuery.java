package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectQuery {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		 * 
		 * connection to the DB
		 * 
		 * */
		
		//connect Driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		
		//Connect to the db
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		//getting connection
		Connection con = DriverManager.getConnection(dburl,username,password);
		
		System.out.println("DB connected");
		
		//Run a Query
		String query = "select * from movies";
		
		//send query to db
		Statement stmt = con.createStatement();
		//execute db
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
