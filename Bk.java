package oopsjava29jan;
class Author1
{
	String name;
	String email;
	Author1(String nm,String mail)
	{
		name = nm;
		email = mail;
	}
	String getname()
	{
		return name;
	}
	String getemail()
	{
		return email;
	}
	void  setemail(String mail1)
	{
		email = mail1;
	}
	public String toString()
	{
		return "Author["+name+ ","+email+"]";
	}
}
class p5
{
	String isbn;
	String name;
	Author1 author;
	double price;
	int qty = 0;
	p5(String isbn1,String nm,Author1 authorr,double pr,int qty1)
	{
		isbn = isbn1;
		name = nm;
		author = authorr;
		price = pr;
		qty = qty1;
	}
	String getisbn()
	{
		return isbn;
	}
	String getname()
	{
		return name;
	}
	Author1 getauthor()
	{
		return author;
	}
	double geprice()
	{
		return price;
	}
	int getqty()
	{
		return qty;
	}
	void setprice(double d)
	{
		price = d;
	}
	void setqty(int qtty) {
		qty = qtty;
	}
	String getAuthorname()
	{
		return name;
	}
	@Override
	public String toString() {
		return "p5 [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
	}
}
public class Bk {

	public static void main(String[] args) {
		Author1 a1 = new Author1("praju","pra@gmail.com");
		System.out.println(a1);
		a1.setemail("ahteck@somewhere.com");
	      System.out.println(a1);
	      System.out.println("name is: " + a1.getname());
	      System.out.println("email is: " + a1.getemail());

	      // Test Book class
	      p5 b1 = new p5("12345", "Java for dummies", a1, 8.8, 88);
	      System.out.println(b1);

	      b1.setprice(9.9);
	      b1.setqty(99);
	      System.out.println(b1);
	      System.out.println("isbn is: " + b1.getname());
	      System.out.println("name is: " + b1.getname());
	      System.out.println("price is: " + b1.geprice());
	      System.out.println("qty is: " + b1.getqty());
	      System.out.println("author is: " + b1.getauthor());  // Author's toString()
	      System.out.println("author's name: " + b1.getAuthorname());
	      System.out.println("author's name: " + b1.getauthor().getname());
	      System.out.println("author's email: " + b1.getauthor().getemail());


	}

}
