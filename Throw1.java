package exception;

import java.util.Scanner;

class Age extends Exception{
	int userage;
	Age(String s)
	
	{
		super(s);
	}
}
public class Throw1 {
	public static void main(String args[]) {
	Age ob =new Age("not eligible ");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter age");
	ob.userage = sc.nextInt();
	try
	{
		if(ob.userage<19)
		{
			throw ob;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	

}

