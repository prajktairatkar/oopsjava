package exception;

public class Exception2 {
	public static void main(String args[]) {
		int num =24,deno = 0, ans =0;
		int a[]= new int[4];
		System.out.println("besore division");
		try {
			a[4] = 8;
			ans = num/deno;
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println(ans);
	}

}
