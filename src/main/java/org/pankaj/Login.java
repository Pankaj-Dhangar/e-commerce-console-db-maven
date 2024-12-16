package org.pankaj;


import java.util.Scanner;

public class Login {
	public static void Login() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<<< Welcome to Login Page >>>");
		
		System.out.println("\t Enter UserName :");
		String username = sc.next();
		
		System.out.println("\t Enter Password :");
		String password = sc.next();
		
		if(username.equals("pankaj")) {
			if(password.equals("pass@12")) {
				System.out.println("*** Login Successful ***");	
				return;
		}else{
			System.out.println("!!!!! Login Fail !!!!!!");
			System.exit(0);
		}
		
	}
			
		
	}
	

}
