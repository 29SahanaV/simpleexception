package com.banking;

import java.util.Scanner;

import static java.lang.System.*;
public class loginid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bs=new Scanner(System.in);
		datavalidations dv=new datavalidations();
		out.println("Enter username");
		String username=bs.next();
		try {
			if(dv.checkUsername(username)) {//checking username 
			
				out.println("Enter Password");
				String password=bs.next();
					try {
						if(dv.checkPassword(password))//checking password
						{
							try {
							if(dv.logincheck(username, password)) {//checking for login
								out.println("Login Success");
							}
						}
							catch(Exception e) {
								out.println(e.getMessage());
							}
						}
					}
					catch(Exception e) {
						out.println(e.getMessage());
					}				
			}
			
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}
	bs.close();//close scanner
	}

}

