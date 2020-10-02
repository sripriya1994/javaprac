package com.priya.Demo;

public class A 
{
	 int x=1;//instance variables
	static int y=20;//static variables
	public static void main(String[] args)
	{
	   int z=121;//local var located inside method and it is called within the method only
	  A obj=new A();
	 System.out.println(obj.x);//by using obj ref
	 System.out.println(new A().x );//directly creating obj
	 System.out.println(y );//we can call static variable directly as well as obj reference
	 System.out.println(obj.y ); 
	 System.out.println(z );//we can call directly local variables 
	  
		
	}

}
