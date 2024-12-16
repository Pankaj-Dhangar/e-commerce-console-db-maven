package org.pankaj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class UserManagement {
	public static void UserManagement()throws SQLException {
		
		String url = "jdbc:mysql://127.0.0.1:3306/e_commers";
		String username = "root";
		String password = "Pankaj@420";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		
		Statement statement = connection.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
	while (true) {
		System.out.println("What would you like to do today");
		System.out.println("1.Add user");
		System.out.println("2.Search user");
		System.out.println("3.Remove user");
		System.out.println("4.Display user");
		System.out.println("9.Quit");
		
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("\t Add User");
			
			System.out.println("\t Enter User Name :");
			String username1 = sc.next();
			
			System.out.println("\t Enter User Password :");
			String password1 = sc.next();
			
			System.out.println("\t Enter Gmail  :");
			String gmail = sc.next();
			
			System.out.println("\t Enter user Id :");
			String id = sc.next();
			
			String query = ("INSERT INTO `e_commers`.`user` \n")
					+"(username,password,gmail,id)\n"
					+"VALUES('"+username1+"', '"+password1+"', '"+gmail+"' ,'"+id+"')";
			
			statement.execute(query);
			
				System.out.println(" \tUser Add Successfully ");	
		}	
		if (option ==2) {
			
			System.out.println("Enter User Name to search :");
			String name = sc.next();
			
			String query ="SELECT * FROM  e_commers.user WHERE username = '"+name+"';";
			
			ResultSet result =statement.executeQuery(query);
			while(result.next()) {
	                System.out.println("Name: " + result.getString(1));
	                System.out.println("password: " + result.getString(2));
	                System.out.println("Gmail: " + result.getString(3));
	                System.out.println("User ID: " + result.getString(4));
	                System.out.println("User Found Successfully");
	            }
	        }	
		if(option ==3) {
			System.out.println("Enter User Name to Remove :");
			String name = sc.next();
			
			String query = "delete FROM user WHERE username= '"+name+"';";
			statement.execute(query);
				System.out.println("User Deleted successfully");			
		}
			
		if(option==4) {
			
			System.out.println("\t Display User ");
			
			String query =("select * from e_commers.user");
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				 System.out.println("Name: " + result.getString(1));
	                System.out.println("password: " + result.getString(2));
	                System.out.println("Gmail: " + result.getString(3));
	                System.out.println("User ID: " + result.getString(4));			}

			statement.execute(query);

				System.out.println(" \tUser update Successfully ");
				return;
			}
		if (option==9) {
			System.out.println("Execting application ....");
			return;
		}
		
			
	    }
		
		
	}
			
			
}
	


