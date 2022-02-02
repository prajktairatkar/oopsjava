package one;

public class ex1 {

	public static void main(String[] args) {
		int[]a= {1,2};
		String s="abcd";
		String s1=null;
		try {
			System.out.println(9/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("/ by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String");
		}

	}

	
	}

}
