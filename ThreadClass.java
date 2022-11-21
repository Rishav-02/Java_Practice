class A extends Thread
{
    public void run( )
    {
      for(int i=1;i<=5;i++)
      {
        System.out.println("\tFrom threadA. i= " +i);
        Thread.sleep(100);
      }
    }
}
class ThreadClass
{
    public static void main(String[ ] args)
    {
       A a=new A();
       a.start();
    }
}