import java.util.*;
import java.util.Scanner;
public class Circle
{
	private int x,y;
	private double r;
	Circle(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Circle(double r)
	{
		this.r=r;
	}
	public double area()//pi *r*R
	{
		return(Math.PI*this.r*r);
	}
	public double circumferance()//2 pi*r
	{
		return(2*Math.PI*this.r);
	}
	public double diameter()
	{
		return(2*this.r);//2*r
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number:");
		double r=sc.nextInt();
		Circle c=new Circle(r);
		System.out.println("area:"+c.area());
		System.out.println("Circumferance:"+c.circumferance());
		System.out.println("diameter"+c.diameter());
	}
}