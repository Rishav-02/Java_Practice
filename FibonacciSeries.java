
class FibonacciSeries
{
    public static void main(String args[])
      {
        int a=0,b=1,n=10,i,c;
        System.out.println(a+" "+b);
        

        for(i=2;i<n;i++)
        {
          c=a+b;
          a=b;
          b=c;
          
          
          System.out.println(c);
        }
        
      }
}