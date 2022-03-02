package oopsjava29jan;
class Point2D{
	private float x;
	private float y;
	Point2D()
	{
		float x = 0.0f;
		float y = 0.0f;
	}
	Point2D(float x,float y)
	{
		this.x = x;
		this.y = y;
	}
	float getX()
	{
		return x;
	}
	void setX(float x)
	{
		x = x;
	}
	float getY()
	{
		return y;
	}
	void setY(float y)
	{
		y = y;
	}
	void setXY(float x,float y)
	{
		x = x;
		y = y;
	}
public	float[] getXY()
	{
		float[] obj = {'x','y'};
		return obj;
	}
@Override
public String toString() {
	return "Point2D [x=" + x + ", y=" + y + "]";
}
}
class Point3D extends Point2D{
	private float  z=0.0f;
	Point3D(float x,float y,float z)
	{
		super(x,y);
		this.z= z;
		
	}
	float getZ()
	{
		return z;
	}
	void setZ(float z)
	{
		z = z;
	}
	void setXYZ(float x,float y,float z)
	{
		super.setXY(x, y);
		z = z;
	}
	float[] getXYZ(){
		float[] obj1 = {'x','y','z'};
		return obj1;
	}
	@Override
	public String toString() {
		return "Point3D [z= " + z + " x =" +getX()+" y = " +getY()+"]";
	}

	
	
}


public class PointtwoD {

	public static void main(String[] args) {
	Point3D p2 = new Point3D(2.4f,3.5f,4.2f);
	
	System.out.println("pints cordinate x is= "+p2.getX()
	+" y is =" +p2.getY()
	+" z is ="+p2.getZ()
	);
	System.out.println(p2);

	}

}
