import java.util.Scanner;
class StackException extends Exception {
    StackException(String s) {
        super(s);
    }
}
class Stack {
    int top = -1, stk[], max;
    Scanner s1 = new Scanner(System.in);
    Stack() {
        max = 5;
        stk = new int[max];
    }
    Stack(int len)
    {
        max = len;
        stk = new int[max];
    }
    void push() throws StackException 
    {
        if (top == max - 1) 
        {
            throw new StackException("Stack Overflow");
        } 
        else 
        {
            top++;
            System.out.println("Enter new element:");
            int ele = s1.nextInt();
            stk[top] = ele;
            System.out.println(ele + " push success...");
        }
    }

    void display() 
    {
        if (top == -1) 
        {

            System.out.println("stk is empty.");
        } 
        else
        {
            System.out.print("stk element is: ");
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(s[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackExceptionDemo 
{
    public static void operation(Stack stack) 
    {
        while (true) 
        {

            try 
            {
                System.out.println("\n1. push");
                System.out.println("2. display stack");
                System.out.println("3. exit");
                System.out.println("enter your choice:");
                int c = sc.nextInt();

                switch (c) 
                {
                    case 1:
                        stack.push();
                        break;
                    case 2:
                        stack.display();
                        break;
                    case 3:
                       System.out.println("exciting...");
                       return;
                    default:
                        System.out.println("invalid choice");
                }
            } 
            catch (StackException e) 
            {
                System.out.println("\n error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
     {
        while (true)
         {
            System.out.println("\n1. already create size of stack (size 5)");
            System.out.println("2. user defined stk");
            System.out.println("Enter your choice:");
            int c = sc.nextInt();

            if (c == 1)
            {
                Stack s1 = new Stack();
                operation(s1);
            } 
            else if (c == 2)
             {
                System.out.println("enter a stk of length:");
                int length = sc.nextInt();
                Stack s2 = new Stack(length);
                operation(s2);
            }
             else
             {
                System.out.println("\ninvalid choice.");
            }
        }
    }
}
