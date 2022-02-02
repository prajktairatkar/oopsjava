package exception;
class pp extends Exception{
public static void parse(String str) {
try {
	
float f = Float.parseFloat(str);
}
catch(NumberFormatException nfe)
{
	nfe.printStackTrace();
}
finally
{
	System.out.println("f");
}
}
}

public class Exc {
	public static void main(String args[]) {
		//pp.obj = new pp();
		parse("String str");
	}

	private static void parse(String string) {
		// TODO Auto-generated method stub
		
	}
	
	}
	
}

	
