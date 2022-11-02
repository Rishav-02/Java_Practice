import java.util.Scanner;

class Distance
{
   public static void main(String args[])
     {  
        float u,a,d=0.0F;
        int i,n,t;
  
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the no of intervals\n");
        n=sc.nextInt();

        for(i=1;i<=n;i++)
      {
  
        System.out.println("enter initial velocity in m/s");
        u=sc.nextFloat();

        System.out.println("enter acceleration in m/s^2");
        a=sc.nextFloat();
      
        System.out.println("enter time in second");
        t=sc.nextInt();

        d=d+(u*t+(a*t*t)/2);
      }
        System.out.println("Total distance travelled is ="+d);
    }
}  