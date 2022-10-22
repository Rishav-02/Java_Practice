//Using two classes

import java.util.*;

class Sum
{
     int x,y;
     Scanner obj= new Scanner(System.in);

     void input()
        {
          System.out.println("Enter any two numbers:");
          x=obj.nextInt();
          y=obj.nextInt();
        }

     void display()
        {
          System.out.println("Sum is:"+(x+y));
        }
}
    
class SumMain
{
     public static void main(String args[])
         {
             Sum sobj=new Sum();
             
             sobj.input();
             sobj.display();
         }
}