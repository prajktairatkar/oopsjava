package oopsjava29jan;
class circle2{
	private double  radius;
	private String color;
	circle2()
	{
		radius = 2.0;
		color= "red";
	}
	circle2(double r)
	{
	radius = r;
	color = "red";
	}
	public double setradius()
	{
		return radius;
		
	}
	public double getcirmuference()
	{
		return 2* Math.PI * radius;
	}
	public double getarea()
	{
		return Math.PI*radius*radius;
	}
	
}
public class Class2 {

	public static void main(String[] args) {
		circle2 c1 = new circle2();
		c1.setradius();
	
		c1.getcirmuference();
		c1.getarea();
		System.out.println("radius of circle is "+c1.setradius());
		System.out.println(" Circumference of circle is "+c1.getcirmuference());
		System.out.println(" Area of circle is "+c1.getarea());

	}

}
