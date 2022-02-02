package oop;
import java.util.*;
class employee{
	String name;
	int id;
	int salary;
	char gen;

void input() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter employee name");
	name = sc.nextLine();
	System.out.println("Enter employee id");
	id = sc.nextInt();
	System.out.println("Enter employee salary");
	salary = sc.nextInt();
	System.out.println("enter employee gender");
	gen = sc.next().charAt(0);
	
}
void display() {
	System.out.println("name " +name);
	System.out.println("id " +id);
	System.out.println("salary " +salary);
	System.out.println("gen " +gen);
}
}
public class Class {
	public static void main(String args[]) {
		employee e1 = new employee();
		e1.input();
		e1.display();
	}

}
