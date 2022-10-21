//Taking input using Scanner class

import java.util.Scanner;

class UserInput
{
    public static void main(String args[])
         {
          Scanner obj= new Scanner(System.in);
         
          System.out.println("Enter any number:");
          int x= obj.nextInt();

          System.out.println("You have entered:"+x);
         }
}