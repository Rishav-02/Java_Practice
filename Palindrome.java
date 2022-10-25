//Check Palindrome or not

import java.util.Scanner;

class Palindrome
{
     public static void main(String args[])
        {
          int i,n,r,rev=0;
          Scanner s=new Scanner(System.in);

          System.out.println("Enter any number:");
          n=s.nextInt();
       
          for(i=n;i>0;)
          {
            r=i%10;
            rev=rev*10+r;
            i=i/10;
          }
            if(n==rev)
            System.out.println("Number is Palindrome");
            else
            System.out.println("Number is not Palindrome");
        }
} 