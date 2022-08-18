package com.banking;
import  java.lang.*;
public class agecheck {
	
	public boolean check(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is not enough to vote");
		}
		else {
			return true;
		}
	}
}
