class SumFibonacci
{
   public static void main(String args[])
      {
         int a=0,b=1,n=10,i,c=1,sum=a+b;
         System.out.println("c="+(a+b));
    
         for(i=2;i<=10;i++)
         {
           a=b;
           b=c;
           c=a+b;
           sum=sum+c;
         }
          System.out.println("sum of Fibonacci="+sum);
      }
}