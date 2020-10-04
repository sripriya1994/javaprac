package priya1;

import java.util.Scanner;

public class Employee2 
{   
	static double BP,HRA,PF,GP,NP,MA,PT,FA,HA;
	Scanner get = new Scanner(System.in);
	void display()
	{
		System.out.println ("Enter the Employee basic salary");
        int BP = get.nextInt();

		HRA=BP*0.3;
		HA=BP*0.2;
		PF=BP*0.07;
		MA=BP*0.04;
		PT=200;
		FA=BP*0.1;
		GP=BP+HRA+PF;
		NP=GP-PF-MA;
		System.out.println("Your House Rent Allowance is :"+ "  " +HRA);
		System.out.println("Your Holiday allowance is :"+"  "+HA);
		System.out.println("Your Provident Fund is :"+"  "+PF);
		System.out.println("Your Medical allowance is :"+"  "+MA);
		System.out.println("Your Professional tax is :"+"  "+PT);
		System.out.println("Your Food allowance is :"+"  "+FA);
		System.out.println("....................................");
		System.out.println("Gross Pay is :"+"  " +GP);
		System.out.println("....................................");
		System.out.println("Net Pay is :"+"  "+NP);
		
	}
	public static void main(String[] args) 
	{
		Employee2 a=new Employee2();
		a.display();
		
	}

}
