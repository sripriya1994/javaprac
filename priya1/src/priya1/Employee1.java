package priya1;

import java.util.Scanner;

public class Employee1 
{
	String Emp_basicpay;
	double BP=20000,HRA=0.3,PT=200,PF=0.1,HA=0.2,MA=0.04,FA=0.1,GP;
	Scanner get = new Scanner(System.in);
	Employee1()
	{	
	System.out.println("enter the employee basic pay");
		Emp_basicpay=get.nextLine();
	}
    void hra()
   {
	double x=BP*HRA;
	System.out.println("YOUR HOUSE RENTAL ALLOWANCE  is :"+"    "+x  );
	
   }
   double holidayAllowance()
   {
	   double x=BP*HA;
	   System.out.println("YOUR  HOLIDAY ALLOWANCE      is :"+"    "+x   );
	   return x;   
   }
   double foodAllowance(double x)
   {
	   double y=BP*FA;
	   System.out.println("YOUR    FOOD ALLOWANCE       is :"+"    " + y );
	   return y;
   }
   void ptax(int x)
   {
	   double x1=PT;
		System.out.println("YOUR        PROFF TAX        is :"+"    "+x1);
   }
   double pF()
   {
	   double x=BP*PF;
	   System.out.println("YOUR     PROVIDIENT FUND     is :"+"    "+x );
	   return x;
   }
   double MedicalA()
   {
	   double x=BP*MA;
	   System.out.println("YOUR MEDICAL ALLOWANCE       is :"+"    "+x );
	   System.out.println("................................................");
	   return x;
   }
   double grossPay()
   {
	   
	double x=BP+(BP*HRA)+(BP*PF)+(BP*HA)+(BP*MA)+(BP*FA)+PT;
	System.out.println("YOUR      Gross pay          is :"+"    "+ x );
	System.out.println("....................................................");
	   return x;
   }
   double netPay()
   {
    double GP=BP+(BP*HRA)+(BP*PF)+(BP*HA)+(BP*MA)+(BP*FA)+PT;
	double x=GP-(BP*PF)-(BP*MA)-PT;
	System.out.println("YOUR        NetPay           is :"+"    " +x );
	System.out.println("....................................................");
	   return x;
	   
   }
   public static void main(String[] args)
   {
	Employee1 a=new Employee1();
	a.hra();
	a.holidayAllowance();
	a.foodAllowance(0.1);
	a.ptax(200);
	a.pF();
	a.MedicalA();
	a.grossPay();
	a.netPay();
	
}
}
