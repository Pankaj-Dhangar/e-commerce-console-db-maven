package org.pankaj;

import java.sql.SQLException;
import java.util.Scanner;

public class ECommerceMain {
	public static void main(String[] args) throws SQLException {
		
		System.out.println("<<<<<<< Welome to E-Commerces >>>>>");
		Scanner sc = new Scanner (System.in);
		
		Login.Login();
		
		while(true) {
			System.out.println("What Would you like to do today");
			System.out.println("1.User Management");
			System.out.println("2.Product Management");
			System.out.println("9.Quit");
			
			int option = sc.nextInt();
			if(option == 1) {
				UserManagement.UserManagement();
				
			}else if(option==2) {
				productmanagement.productmanagement();
			}else if (option == 9) {
				System.out.println("Executing application ........");
				return;
			}
			
		}
	}

}
