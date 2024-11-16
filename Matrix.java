
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int colsA = scanner.nextInt();

        System.out.print("Enter the number of rows for matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int colsB = scanner.nextInt();

        if (rowsA != rowsB || colsA != colsB)
       {
            System.out.println("add or sum matrix are same");
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++)
         {
            for (int j = 0; j < colsB; j++) 
            {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        int[][] sum = add(matrixA, matrixB);
        int[][] subtraction = subtractMatrices(matrixA, matrixB);
        
        if (colsA != rowsB) 
        {
            System.out.println("multiplication require row and column.");
            return;
        }
        int[][] multiplication = multiplyMatrices(matrixA, matrixB);
        System.out.println("Matrix A:");
        printMatrix(matrixA);
        System.out.println("Matrix B:");
        printMatrix(matrixB);
        System.out.println("Sum:");
        printMatrix(sum);
        System.out.println("Subtraction:");
        printMatrix(subtraction);
        System.out.println("Multiplication:");
        printMatrix(multiplication);
        
        scanner.close();
    }

    public static int[][] add(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sum;
    }

    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] subtraction = new int[rows][cols];

        for (int i = 0; i < rows; i++)
         {
            for (int j = 0; j < cols; j++) 
            {
                subtraction[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }

        return subtraction;
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB)
     {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        int[][] multiplication = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++)
         {
            for (int j = 0; j < colsB; j++)
             {
                for (int k = 0; k < colsA; k++)
                 {
                    multiplication[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return multiplication;
    }

    public static void printMatrix(int[][] matrix) 
    {
        for (int i = 0; i < matrix.length; i++)
         {
            System.out.print("| ");
            for (int j = 0; j < matrix[0].length; j++)
             {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("");
    }
}

