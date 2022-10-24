//Sum of following series sum=1!/1+2!/2+3!/3____________+n!/n.

import java.util.Scanner;

class Series
{
      public static void main(String args[])
         {
           int i,num,f=1;
           double sum=0.0;
           Scanner s=new Scanner(System.in);

           System.out.println("Enter the range of no");
           num=s.nextInt();

           for(i=1;i<=num;i++)
           {
              f=f*i;
              sum=sum+f/i;
           }
           System.out.println("sum of series="+sum);
         }
}  


     