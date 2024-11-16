import java.util.Scanner;
abstract class Shape
{
	int x,y;	
	public abstract double area()
	public abstract double perimeter()
}
class Rectangle extends Shape
{
	public Rectangle()
	{
		x=10;
		y=20;
	}
	public Rectangle(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	public double area()
	{
		return x*y;
	}
	public double perimeter()
	{
		return 2*(x+y);
	}
}
class Triangle extends Shape
{
	int z;
	public Triangle()
	{
		x=10;
		y=20;
		z=30;
	}
	public Triangle(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double area()
	{
		return x*y;
	}
	public double perimeter()
	{
		return x+y+z;
	}
}
class Circle extends Shape
{
	public Circle()
	{
		x=10;
	}
	public Circle(int x)
	{
		this.x=x;
	}
	public double area()
	{
		return Math.PI*x*x;//3.14*r*r
	}
	public double perimeter()
	{
		return 2* Math.PI*x;
	}
}
public class AbstractDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and width");
		int length=Scanner.nextInt();
		int width=Scanner.nextInt();
		Rectangle rc=new Rectangle(length,width);
		System.out.println("area of rectangle"+rc.area());
		System.out.println("perimeter of rectangle"+rc.perimeter());
		System.out.println("enter trianges slid:");
		int s1=Scanner.nextInt();
		int s2=Scanner.nextInt();
		int s3=Scanner.nextInt();
		Triangle tr=new Triangle(s1,s2,s3);
		System.out.println("area of trianges"+tr.area());
		System.out.println("perimeter of trianges"+tr.perimeter());
		System.out.println("enter readius of circle:");
		int radius=Scanner.nextInt();
		Circle c1=new Circle(radius);
		System.out.println("area of circle"+c1.area());
		System.out.println("perimeter of circle"+c1.perimeter());
		Scanner.close();

	}
}