import java.util.Scanner;

public class Factorial
{
     public static void main(String args[])
    {
        int i,num;
        int f=1;

        Scanner s= new Scanner(System.in);
      
        System.out.println("Enter a number:");
        num=s.nextInt();

        for(i=1;i<=num;i++)
          f=f*i;
        System.out.println("Factorial of "+num+"is" +f);
    }
}