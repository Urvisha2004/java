/*private class Number
{
	public static double isZero(value)
	{
		return this.value=value;
	}
	public static void main(String args[])
	{   
	double n;
	    Scanner sc = new Scanner(System.in);

        System.out.print("Enter a zero value ");
        long n = sc.nextLong();
		System.out.println("The number " + n + " is prime: " + isZero(n));

	}
}*/
import java.util.Scanner;

public class Number {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero()
	{
        return this.value == 0;
    }

	public boolean isPositive()
	{
		return this.value>0;
	}
	public boolean isNegative()
	{
		return this.value<0;
	}
	public boolean isEven()
	{
		return this.value%2==0;
	}
	public boolean isOdd()
	{
		return this.value%2!=0;
	}
	public double getFactorial()
	{
		int fact=1;
		for(int i=1;i<=value;i++)
		{
			fact *=i;
		}
		return fact;
		
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number");
		
   double n = sc.nextDouble();

        Number number = new Number(n);
        System.out.println(" number " + n + " is zero: " + number.isZero());
		
		System.out.println("number " + n + " is positive: " + number.isPositive());
		System.out.println("number " + n + " is negative: " + number.isNegative());
		System.out.println("number " + n + " is even: " + number.isEven());
	    System.out.println("number " + n + " is odd: " + number.isOdd());
	    System.out.println("number " + n + " is factorial: " + number.getFactorial());
		
    }
}
