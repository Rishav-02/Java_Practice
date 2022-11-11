class ErrorHandling
{
    public static void main(String args[ ])
      {
          int a=10;int b=0;int c;

          try
          { 
           c=a/b;
           System.out.println("The result is "+c);
          }
          catch(Exception e)
          {
           System.out.println("You have divided by ZERO");
          }
            finally
          {
            System.out.println("Can you catch me");
          }

      }
} 