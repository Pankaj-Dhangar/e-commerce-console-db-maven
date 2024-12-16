package org.pankaj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class productmanagement {
	public static void productmanagement() throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/e_commers";
		String username = "root";
		String password = "Pankaj@420";
		
		Connection connection = DriverManager.getConnection(url,username,password);
		
		Statement statement = connection.createStatement();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("what would you like to do today ");
			System.out.println("1.Add product");
			System.out.println("2.Search product");
			System.out.println("3.Remove product");
			System.out.println("4.Display product");
			System.out.println("9.Quit");
			
			int option = sc.nextInt();
			
			if(option==1) {
				System.out.println("\t Add product");
				System.out.println("Enter product id :");
				String id = sc.next();
				
				System.out.println("Enter product Name :");
				String name = sc.next();
				
				System.out.println("Enter product Price :");
				String price = sc.next();
				
				System.out.println("Enter product Quantity :");
				String quantity = sc.next();
				
				String query = "INSERT INTO `e_commers`.`product`\n"
						+"(id,name,price,quantity)"
						+"VALUE('"+id+"','"+name+"','"+price+"','"+quantity+"')";
				
				statement.execute(query);
				
				System.out.println("** Product Added Successfully **");
				
			}
			if(option==2) {
				System.out.println("Enter Produt id To Search :");
				String id = sc.next();
				
				String query = "SELECT * FROM `e_commers`.`product`WHERE id = '"+id+"'";
				
				ResultSet result = statement.executeQuery(query);
				
				while(result.next()) {
					    System.out.println("Name: " + result.getString(1));
		                System.out.println("password: " + result.getString(2));
		                System.out.println("Gmail: " + result.getString(3));
		                System.out.println("User ID: " + result.getString(4));
		                System.out.println("User Found Successfully");
		            }
				}
			if(option == 3) {
				System.out.println("Enter product id To Remove Product :");
				String id = sc.next();
				
				String query = "delete * From `e_commers`.`product` WHERE id = '"+id+"'";
				statement.execute(query);
				
				System.out.println("Product Remove Successfully ");
			}
			if (option == 4) {
				System.out.println("\t Display Product :");
				
				String query = "SELECT * FROM  `e_commers`.`product`";
				
				ResultSet result = statement.executeQuery(query);
				
				while(result.next()) {
					    System.out.println("Name: " + result.getString(1));
		                System.out.println("password: " + result.getString(2));
		                System.out.println("Gmail: " + result.getString(3));
		                System.out.println("User ID: " + result.getString(4));
		                
		                statement.execute(query);
		             System.out.println("\t Product Displayed Successfully ");  
		             return;
				}				
			}
			if(option == 9) {
				System.out.println("Exeuting application ....");
				return;
			}
	
		}
	}
}



