package PACKAGE1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class A {

	
	@Test
	public void A()
	{
		System.out.println("A calling");
	}
	
	
	
	@Test
	public void A1()
	{
		System.out.println("A1 calling");
		
		Scanner sc =new Scanner(System.in);
		   
		   System.out.println("enter sie of array");
		   int size=sc.nextInt();	
	}
	
	
	
	
	
	
}
