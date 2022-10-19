     //WRONG LOGIC

class Prime
{
    public static void main(String args[])
     {
       int i,num;
       num= Integer.parseInt(args[0]);

       for(i=2;i<=num-1;i++)
          if(num%i==0)
                break;
          if(i==num)
         System.out.println("No. is Prime");
          else
         System.out.println("No. is not Prime");
      }
}
        
