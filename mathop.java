import static java.lang.Math.*;
public class mathop
{
     public void circle(double r)
        {
            double area=PI*r*r;
            System.out.println("The Area of Circle is :"+area);   
        }
            public static void main(String args[])
           {
              mathop obj=new mathop( );
              obj.circle(2.3);
           }
}