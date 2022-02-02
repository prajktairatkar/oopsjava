package exception;

public class Except1 {

	public static void main(String[] args) {
		 int a= 10;
		 int b = 0;
		 int ans;
		 try
		 {
			 ans = a/b;
		 }
		 catch(ArithmeticException e)
		 {
			 //System.out.println("not divide by zero");
			 e.printStackTrace();
		 }
		 
}

}
