import java.util.Scanner;
class Matrix
{
    Scanner sc=new Scanner(System.in);
    private double[][] m1;
    private double[][] m2;
    private double[][] result;
    private int row,cols;

    Matrix()
    {
        
        row=3;
        cols=3;
        m1=new double[row][cols];
        m2=new double[row][cols];
        result =new double[row][cols];

    }
    Matrix(int row,int cols)
    {
        this.row=row;
        this.cols=cols;
        m1=new double[row][cols];
        m2=new double[row][cols];
        result =new double[row][cols];
    }
    public void readMtrix()
    {
       System.out.println("enter matrix 1 value:");
       for(int i=0;i<row;i++)
       {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter element at ["+i+"]["+j+"] : ");
                m1[i][j]=sc.nextDouble();
            }
       }
       System.out.println("enter matrix 2 value:");
       for(int i=0;i<row;i++)
       {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Enter element at ["+i+"]["+j+"] : ");
                m2[i][j]=sc.nextDouble();
            }

       }

    }
    public void add()
    {
        double[][] result=new double[row][cols];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result[i][j]=m1[i][j]+m2[i][j];
            }
        }
        printMat(result);
    }
   public void sub()
    {
        double[][] result=new double[row][cols];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result[i][j]=m1[i][j]-m2[i][j];
            }
        }
        printMat(result);
    }
    public void mul()
    {
        double[][] reasult=new double[row][cols];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                for(int k=0;k<row;k++)
                {
                    result[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        printMat(result);
    }
    public void transpose()
    {
        double[][] reasult=new double[row][cols];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                result[j][i]=m1[i][j];
            }
        }
        printMat(result);
    }
    public void inverse() {
        if (row != 3 || cols != 3) {
            System.out.println("Inverse can only be calculated for 3x3 matrices.");
            return;
        }

        double determinant = m1[0][0] * (m1[1][1] * m1[2][2] - m1[1][2] * m1[2][1])
                - m1[0][1] * (m1[1][0] * m1[2][2] - m1[1][2] * m1[2][0])
                + m1[0][2] * (m1[1][0] * m1[2][1] - m1[1][1] * m1[2][0]);

        if (determinant == 0) {
            System.out.println("This matrix doesn't have an inverse (determinant is 0).");
            return;
        }

        double[][] cofactor = new double[3][3];
        cofactor[0][0] = (m1[1][1] * m1[2][2] - m1[1][2] * m1[2][1]);
        cofactor[0][1] = -(m1[1][0] * m1[2][2] - m1[1][2] * m1[2][0]);
        cofactor[0][2] = (m1[1][0] * m1[2][1] - m1[1][1] * m1[2][0]);

        cofactor[1][0] = -(m1[0][1] * m1[2][2] - m1[0][2] * m1[2][1]);
        cofactor[1][1] = (m1[0][0] * m1[2][2] - m1[0][2] * m1[2][0]);
        cofactor[1][2] = -(m1[0][0] * m1[2][1] - m1[0][1] * m1[2][0]);

        cofactor[2][0] = (m1[0][1] * m1[1][2] - m1[0][2] * m1[1][1]);
        cofactor[2][1] = -(m1[0][0] * m1[1][2] - m1[0][2] * m1[1][0]);
        cofactor[2][2] = (m1[0][0] * m1[1][1] - m1[0][1] * m1[1][0]);

        double[][] adjugate = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                adjugate[i][j] = cofactor[j][i];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = adjugate[i][j] / determinant;
            }
        }

        System.out.println("Inverse of the matrix:");
        printMat(result);
    }
    public void printMat(double[][] result)
    {
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print("  "+result[i][j]);
            }
            System.out.println();
        }
    }
    public String toString()
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println(m1[i][j]+" ");
            }
            System.out.println();
        }
        return " ";
        //printMat(result);
        
    }



}
public class P8Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of row in matrix");
        int row = sc.nextInt();
        System.out.println("enter number of cols in matrix");
        int cols = sc.nextInt();


        Matrix m=new Matrix();
        m.readMtrix();
        System.out.println("addition od mattrix\n");
        m.add();
        System.out.println("\nsubtraction od mattrix\n");
        m.sub();
        System.out.println("\n multiplication od mattrix\n");
        m.mul();
        System.out.println("transpose matrix\n");
        m.transpose();
        System.out.println("\n inverse matrix");
        m.inverse();

    }
}