package oopsjava29jan;
class Ac{
String id;
String name;
int balance = 0;
Ac(String id,String name,int balance){
	this.id = id;
	this.name = name;
	this.balance = balance;
}
	String getid()
	{
		return id;
		
	}
	String getname()
	{
		return name;
		
	}
	int getbalance()
	{
		return balance;
	}
	int credit(int amount)
	{
		return amount;
	}
	int dedit(int amount)
	{
		return amount ;
	}
	int another(int amount)
	{
		amount =1233;
	if( amount <= balance)
	{
		return amount;
	}
	else
	{
		System.out.println("Exceeds");
		//return balance;
	}
	return balance;
}
}
public class Account {
	public static void main(String args[]) {
	Ac obj =new Ac("A121","prajkta",11);
	System.out.println("ID: " + obj.getid());
    System.out.println("Name: " + obj.getname());
    System.out.println("Balance: " + obj.getbalance());
int cr = obj.credit(22000);
System.out.println("credit is"+cr);
int dt = obj.dedit(11000);
System.out.println("dedit is"+dt);
obj.another(0);
	}
}


