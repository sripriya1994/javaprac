package com.priya.Demo;

import java.util.Scanner;

public class Calculator 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first num");
		num1=s.nextInt();
		System.out.println("enter the second num");
		num2=s.nextInt();
		System.out.println("enter the operator( +,-,*,/)");
		String sym=s.next();
		int res;
		switch(sym)
		{
			case "+":
				res=num1+num2;
				System.out.println(res);
				break;
			case "-":
				res=num1-num2;
				System.out.println(res);
				break;
			case "*":
				res=num1*num2;
				System.out.println(res);
				break;
			case "/":
				res=num1/num2;
				System.out.println(res);
				break;
		   default:
					System.out.println("invalid operator");
		}
	}

}
