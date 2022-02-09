package matrix;

import java.util.Scanner;

public class MatrixMul {
	public static void main(String args[])
	{
    int m, n, p, q, sum = 0, c, d, k;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of rows and columns of first matrix:");
    m = input.nextInt();
    n = input.nextInt();

    int first[][] = new int[m][n];

    System.out.println("Enter elements of first matrix:");

    for (c = 0; c < m; c++)
       for (d = 0; d < n; d++)
          first[c][d] = input.nextInt();

    System.out.println("Enter the number of rows and columns of second matrix:");
    p = input.nextInt();
    q = input.nextInt();

    if (n != p)
       System.out.println("The matrices can't be multiplied with each other.");
    else
    {
       int second[][] = new int[p][q];
       int multiply[][] = new int[m][q];

       System.out.println("Enter elements of second matrix:");

       for (c = 0; c < p; c++)
          for (d = 0; d < q; d++)
             second[c][d] = input.nextInt();

       for (c = 0; c < m; c++)
       {
          for (d = 0; d < q; d++)
          {  
             for (k = 0; k < p; k++)
             {
                sum = sum + first[c][k]*second[k][d];
             }

             multiply[c][d] = sum;
             sum = 0;
          }
       }

       System.out.println("Multiplication of the matrices:");

       for (c = 0; c < m; c++)
       {
          for (d = 0; d < q; d++)
             System.out.print(multiply[c][d]+"\t");

          System.out.print("\n");
       }
    }
 }

}
