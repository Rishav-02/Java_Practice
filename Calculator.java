import java.util.Scanner;

class Calculator
{
     public static void main(String args[])
    {
       int x,y,ch;
       Scanner obj=new Scanner(System.in);

       do
       {
         System.out.println("Enter your choice");
         System.out.println("Press 1 for Add");
         System.out.println("Press 2 for Subtract");
         System.out.println("Press 3 for Multiply");
         System.out.println("Press 4 for Divide");
         ch=obj.nextInt();

         switch(ch)
        {
          case 1: System.out.println("Enter two no.");
                   x=obj.nextInt();
                   y=obj.nextInt();
                  System.out.println("Result is "+(x+y));
                  break;

          case 2: System.out.println("Enter two no. ");
                   x=obj.nextInt();
                   y=obj.nextInt();
                  System.out.println("Result is "+(x-y));
                  break;

          case 3: System.out.println("Enter two no. ");
                   x=obj.nextInt();
                   y=obj.nextInt();
                  System.out.println("Result is "+(x*y));
                  break;

          case 4: System.out.println("Enter two no. ");
                   x=obj.nextInt();
                   y=obj.nextInt();
                  System.out.println("Result is "+(x/y));
                  break;

          default: System.out.println("Invalid choice !!!");
        }
          System.out.println("Press 0 to Continue");
          ch=obj.nextInt();
       }  while(ch==0);
     }
}