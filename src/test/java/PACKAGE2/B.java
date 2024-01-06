package PACKAGE2;

import java.util.Scanner;

import org.testng.annotations.Test;

public class B {

	@Test
	public void B()
	{
		System.out.println("B calling");
	}
	
	
	@Test
	public void B1()
	{
		System.out.println("B1 calling");
		
		Scanner sc =new Scanner(System.in);
		   
		   System.out.println("enter sie of array");
		   int size=sc.nextInt();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
