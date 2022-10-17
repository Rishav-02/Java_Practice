class LargestNumber
{
       public static void main(String args[])
        {          
          int x= Integer.parseInt(args[0]);
          int y= Integer.parseInt(args[1]);

          if(x>y)
          System.out.print("\n x+ is Largest");
          else if(y>x)
          System.out.print("\n y+ is Largest");
          else
          System.out.print("\n x and y are Equal");
        }
}
