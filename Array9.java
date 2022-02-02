package oop;
import java.util.*;
class product{
String name;
int id;

void input()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name ");
	name = sc.nextLine();
	System.out.println("Enter id ");
	id = sc.nextInt();
}
void display()
{
	System.out.println("name"+name);
	System.out.println("id"+id);
}
}
public class Array9 {
	public static void main(String args[]) {
		product s1[] = new product[2];
		for(int i=0;i<s1.length;i++)
		{
		s1[i]= new product();
		s1[i].input();
		s1[i].display();
	}
	
	}
}
