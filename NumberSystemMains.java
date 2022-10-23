import java.util.Scanner;

class NumberSystem
{
  int i,n,r,rev=0;
  Scanner obj=new Scanner(System.in);

  void input()
      {
        System.out.println("Enter a Number");
        n=obj.nextInt();

        
        for(i=n;i>0;)
         {
           r=i%10;
           rev=rev*10+r;
           i=i/10;
         }
      }

  void palindrome()
      {
        if(n==rev)
           System.out.println("Number is palindrome");
        else
           System.out.println("Number is not palindrome");
      }
}

class NumberSystemMains
{
    public static void main(String args[])
         {
            NumberSystem nobj=new NumberSystem();
          
            nobj.input();
            nobj.palindrome();
         }
}

          

