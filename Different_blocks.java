package one;
public class Different_blocks {
	static
	{
		System.out.println("static block");
	}
	Different_blocks()
	{
		System.out.println("constructor block ");
	}
	{
		System.out.println("initilation block");
	}



	public static void main(String args[]) {
		System.out.println("main method ");
		Different_blocks ob = new Different_blocks();
		//System.out.println("main method ");
	}

}
