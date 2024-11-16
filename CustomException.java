class CustomExceptions extends Exception
{
    public CustomExceptions(String s)
    {
        super(s);
    }
}
public class CustomException
{
   public static void main(String [] args)
   {
        //System.out.println("commandline:");
        try
        {
            for(int i=0;i<args.length;i++)
            {
                if(Integer.parseInt(args[i])<0)
                {
                    throw new CustomExceptions("negitive value not use..");
                }
                else
                {
                    System.out.print(args[i]+ "  ");
                }
            }
            
        }
        catch(CustomExceptions e)
        {
            System.out.println(e);
            e.printStackTrace();
        }

   }
}
