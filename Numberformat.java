package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numberformat {
	public static void main(String args[]) throws IOException {
		String name;
		String password;
		int age =0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name");
	    name = br.readLine();
	    System.out.println("Enter password");
	      password = br.readLine();
	      try
	      {
	      System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		}
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
	 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	
	 }
	      System.out.println("name"+name);
	      System.out.println("password"+password);
	      System.out.println("ageis "+age);
}
}
