import java.util.Arrays;
public class SortStrings
{
	public static void main(String args[])
	{
	int i;
	
	String[]s= new String[args.length];
	for(i=0;i<s.length;i++)
	{
		s[i]=args[i];
	}
	System.out.println("array strings");
	for(i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
		
	}
	Arrays.sort(s);
	System.out.println("sorting array strings");
	for(i=0;i<s.length;i++)
	{
		System.out.println(s[i]);
	}
	}
}






/*import java.util.Arrays;
import java.util.Scanner;
public class SortStrings 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        System.out.println("Please enter 5 strings:");
        for (int i = 0; i < 5; i++)	
		{
            strings[i] = scanner.nextLine();
        }
        Arrays.sort(strings);
        System.out.println("Sorted strings:");
        for (String str : strings)
		{			
            System.out.println(str);
        }
        
    }
}*/
/*import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SortStrings {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String[] strings = new String[5];
            System.out.println("Please enter 5 strings:");
            for (int i = 0; i < 5; i++) {
                strings[i] = scanner.nextLine();
            }
            Arrays.sort(strings);
            System.out.println("Sorted strings:");
            for (String str : strings) {
                System.out.println(str);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter 5 strings.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}*/


       
