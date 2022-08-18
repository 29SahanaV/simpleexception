package com.banking;

import java.util.Scanner;
import static java.lang.System.*;
public class simpleexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa=new Scanner(System.in);
		out.println("Enter one number");
		int x=sa.nextInt();
		
		out.println("Enter second number");
		int y=sa.nextInt();
		int a[]= {2,5,6,82,32,9};
		try {
			int z=x/y;
			out.println("z value is"+z);
		}
		catch(Exception e) {
			out.println(e.getMessage());
		}
	}

}
