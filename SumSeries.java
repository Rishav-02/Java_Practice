import java.util.Scanner;

class SumSeries
{
   public static void main(String args[])
     {
        Scanner s=new Scanner(System.in);
        int i,n,sum=0;

        System.out.println("Enter any Number");
        n=s.nextInt();
     
        for(i=1;i<=10;i++)
           sum=sum+(i*n);
        
        System.out.println("sum of series="+sum);
     }
}
