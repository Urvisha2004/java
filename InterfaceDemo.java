import java.util.Scanner;
interface shape
{
		public double area();
		public double perimeter();
}
class Circle implements shape
{	
	double radius;
	Circle()
	{
		System.out.println("circle");
		radius=5;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
	public double perimeter()
	{
		return 2*3.14*radius;
	}
}
class Rectangle implements shape
{
	public double width;
	public double length;
	Rectangle()
	{
		System.out.println("rectangle...");
	}
	Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public double area()
	{
		return length*width;
	}
	public double perimeter()
	{
		return 2*(length*width);
	}
}
class Triangle implements shape
{
	public double base,height,side;
	Triangle()
	{
		System.out.println("Triangle....");
	}
	Triangle(double base,double height,double side)
	{
		this.base=base;
		this.height=height;
		this.side=side;
	}
	public double area()
	{
		return (base*height)/2;
	}
	public double perimeter()
	{
		return base*height*side;
	}
}
class InterfaceDemo
{	
	public static void main(String args[])
	{
		int choice;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ther radius of circle");
		double radius =sc.nextDouble();
		Circle c=new Circle(radius);
		System.out.println("area of circle"+c.area());
		System.out.println("perimeter of circle"+c.perimeter());
		
		System.out.println("enter the rectangle length:");
		double length=sc.nextDouble();
		System.out.println("enter the rectangle width");
		double width=sc.nextDouble();
		Rectangle r=new Rectangle(length,width);
		System.out.println("area of rectangle"+r.area());
		System.out.println("perimeter of rectangle"+r.perimeter());
		
		System.out.println("enter the triangle base:");
		double base=sc.nextDouble();
		System.out.println("enter the triangle height:");
		double height=sc.nextDouble();
		System.out.println("enter the triangle side:");
		double side=sc.nextDouble();
		Triangle t=new Triangle(base,height,side);
		System.out.println("area of triangle"+t.area());
		System.out.println("perimeter of triangle"+t.perimeter());


		
		
	}
}