package one;

import java.util.Scanner;

class acesssp{
	private int id;
	private String name;
	private float fees;
	public void accept() {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter name id and fees");
	name =sc.nextLine();
	id  = sc.nextInt();
	fees = sc.nextFloat();
	}
	void studentDetails()
	{
		//System.out.println("id"+id);
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("fees "+fees);
	}
}
public class Inhri {
public static void main(String args[]) {
	acesssp as = new acesssp();
	as.accept();
	as.studentDetails();
}
}
