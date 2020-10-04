package priya1;

import java.util.Scanner;

public class Evenodd
{
  static void checknumber (int n)
	    {
	        if(n%2==0)
	            System.out.println("Even");
	        else
	            System.out.println("Odd");
	    }
	    public static void main(String[] args) 
	    {
	        System.out.println("Enter a number");
			Scanner get = new Scanner(System.in);
	        int n=get.nextInt();
	        Evenodd.checknumber(n);
	    }}