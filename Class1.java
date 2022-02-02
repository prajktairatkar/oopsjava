package oopsjava29jan;
class circle
{
	private double radius;
	private String color;
	public circle()
	{
		radius = 1.0;
		color = "red";
	}
		public circle(double r)
		{
			radius = r;
			color = "red";
		}
		//return radius
		public double getradius()
		{
			return radius;
	}
		public double getarea()
		{
			return Math.PI * radius * radius;
		}
}
public class Class1 {

	public static void main(String[] args) {
	circle ob = new circle();
	ob.getradius();
	ob.getarea();
	System.out.println("the radius of circle is "  +ob.getradius());
System.out.println("the radius of circle is "  +ob.getarea());
	}

}
