 /*class OddThread extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            try
            {
                if(i%2!=0)
                {
                    System.out.println("odd number:"+i);
                    Thread.sleep(500);
                }
            }
            catch(Exception e)
            {
                System.out.println("wrong....");
            }
        }
    }
}
class PrimeThread implements Runnable
{
    int count=0;
    public void run()
    {
        for(int i=2;i<=100;i++)
        {
            try
            {
                for(int j=0;j<i;j++)
                {
                    if(i%j==0)
                    {
                        count=count+1;
                        break;
                    }
                    if(i%j!=0)
                    {
                        System.out.println("prime number"+i);
                        Thread.sleep(1000);
                    }
             
                }
                count=0;
            }
            catch(Exception e)
            {
                System.out.println("prime wrong....");
            }
        }
    }
}
class MultiThread
{
    public static void main(String s[])
    {
        OddThread od=new OddThread();
        Thread t=new Thread(new PrimeThread());
        od.start();
        t.start();
        
    }
}*/
//odd thread 1 to 100 every half second print odd num
//prime thread 1 to 100 ever................
class OddThread extends Thread 
{
	public void run() 
	{
		for (int i = 1; i <= 100; i++)
			{
				try 
				{
					if (i % 2 != 0)
						{
						System.out.println("odd number: " + i);
						Thread.sleep(100);
						}
				} 
                catch (Exception e) 
				{
				System.out.print("something wents wrong...");
				}
			}
	}
}
class PrimeThread implements Runnable
 {
	int count = 0;
	public void run() 
	{
		for (int i = 2; i <= 100; i++) 
		{
			try {

				for (int j = 2; j < i; j++) 
				{
					if (i % j == 0) 
					{
						count = count + 1;
						break;
					}
					if (i % j != 0) {

						System.out.println("prime number: " + i);
						Thread.sleep(100);
					}
				}
				count = 0;
			} catch (Exception e) {
				System.out.print("something wents wrong...");
			}
		}
	}
}
class MultiThread
 {
	public static void main(String s[]) 
	{
		OddThread od = new OddThread();
		Thread t = new Thread(new PrimeThread());
		od.start();
		t.start();
	}
}