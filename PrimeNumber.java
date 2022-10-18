class PrimeNumber
{
        public static void main(String args[])
        {
          int i,count=0;
          int n= Integer.parseInt(args[0]);
 
         //Logic for checking Prime or Composite
         
          for(i=2;i<=n/2;i++)
          {
            if(n%i==0)
            {
              count++;
              break;
            }
          }
            if(count==0)
            System.out.println("No. is Prime");
            else
            System.out.println("No. is not Prime");
        }
}