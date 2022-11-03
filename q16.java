class q16
{
  public static void main(String args[])
   {
     int count=0;
     for(int i=0;i<3;i++)
         resume:
        for(int j=0;j<4;j++)
            for(int k=0;k<5;k++)
            {
              ++count;
              if(i==1 && j==2 && k==3) break resume;
            }
         System.out.println("\t count="+count);
   }
}