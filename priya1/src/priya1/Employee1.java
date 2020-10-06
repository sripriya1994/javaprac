package priya1;

import java.util.Scanner;

public class EmployeePayslip()
{
	String Emp_basicpay;
	final double BP=20000;
	final double HRA=0.3;
	final static double PT=200;
	final double PF=0.1;
	final double HA=0.2;
	final double MA=0.04;
	final static double FA=2000;
	final double GP=0;
	Scanner get = new Scanner(System.in);
	EmployeePayslip()
	{
	System.out.println("enter the employee basic pay");
		Emp_basicpay=get.nextLine();
	}
	  double hra()
	   {
		double x=BP*HRA;
		return x;
		
	   }
	  double holidayAllowance()
	   {
		   double x=BP*HA;
		  
		   return x;   
	   }
	   double pF()
	   {
		   double x=BP*PF;
		   
		   return x;
	   }
	   double Medical()
	   {
		   double x=BP*MA;
		   
		   return x;
	   }
	  
	  double grossPay()
	   {
		  double A= this.hra(); 
		  double B= this.holidayAllowance();
		  
		  double C= this.pF();
		
		  double D= this.Medical();
		  
		double x=BP+(A+B+C+D)+PT+FA;
		
		   return x;
	   }
	  double grossPayDeduction()
	  {
		  double B= this.Medical();
		  double C=this.pF();
		  double x=-B-C;
		  
		  return x;
	  }
	  double netPay()
	  {
		  double A=this.grossPay();
		  double B=this.grossPayDeduction();
		  double x=A-B;
		 
		  return x;
	  }
	  public static void main(String[] args)
	   {
		  EmployeePayslip a=new EmployeePayslip() ;
		 System.out.println("YOUR HOUSE RENTAL ALLOWANCE  is :"+"    "+a. hra()  );
		 System.out.println("YOUR  HOLIDAY ALLOWANCE      is :"+"    "+a.holidayAllowance() ); 
		 System.out.println("YOUR PROFESSIONAL TAX        is :"+"    "+PT );
		 System.out.println("YOUR FOOD ALLOWANCE          is :"+"    "+FA );
		 System.out.println("YOUR HOUSE RENTAL ALLOWANCE  is :"+"    "+a. pF()  );
		 System.out.println("YOUR HOUSE RENTAL ALLOWANCE  is :"+"    "+a. Medical() );
		 System.out.println(".......................................................");
		 System.out.println("YOUR      Gross pay          is :"+"    "+ a.grossPay());
	     System.out.println("....................................................");
	     System.out.println("YOUR    Gross Pay Deduction  is :"+"    "+ a.grossPayDeduction());
		 System.out.println("....................................................");
		 System.out.println("YOUR      netpay             is :"+"    "+ a.netPay());
		 System.out.println("....................................................");
		
		
	   }

}



