package oop;
//import java.util
import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
class student{
	int id;String name;

void input() throws Exception, IOException  {
	InputStreamReader is = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(is);
	System.out.println("enter student id ");
	id = Integer.parseInt(br.readLine());
	System.out.println("Enter student name");
	name = br.readLine();
}
void display()
{
	System.out.println("student id:"+id);
	System.out.println("student name1"
			+ ":"+name);
}
}
public class Cass2 {
	public static void main(String args[])throws Exception {
		student s1 = new student();
		s1.input();
		s1.display();
		
		
	}

}
