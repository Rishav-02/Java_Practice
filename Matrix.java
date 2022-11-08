import java.util.Scanner;

class Matrix
{
   public static void main(String args[])
   {
     
     Scanner num=new Scanner(System.in);
     int mat1[][]=new int[3][3];
     int mat2[][]=new int[3][3];
     int sum[][]=new int[3][3];
     int i,j;
  
     //Input of both matrices

     System.out.println("Enter the elements of mat1");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      mat1[i][j]=num.nextInt();
      System.out.println();
     }  

     System.out.println("Enter the elements of mat2");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      mat2[i][j]=num.nextInt();
      System.out.println();
     }

     //Sum process
     
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      sum[i][j]=mat1[i][j]+mat2[i][j];
     }

     //Display Sum of Matrix

     System.out.println("Sum of Both matrices");
     for(i=0;i<3;i++)
     {
      for(j=0;j<3;j++)
      System.out.print(sum[i][j]+"\t");  
      System.out.println();
     }        
   }
}