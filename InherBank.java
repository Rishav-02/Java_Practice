import java.util.Scanner;

class BankAccount
{
  Scanner obj=new Scanner(System.in);
  
  String name;
  double acc_no;
  int depo,wdrl,bal=10000;
  int num;

   void input() 
   {
     System.out.println("Enter your name");
     name=obj.nextLine();
     System.out.println("Enter your account number"); 
     acc_no=obj.nextDouble();
     System.out.println("Enter your mobile number"); 
     num=obj.nextInt();
   }

   void display()
   {
     System.out.println("Your name is:" +name);
     System.out.println("Your account number is:" +acc_no);
     System.out.println("Your mobile number is:" +num);
     System.out.println("Your current Balance is:" +bal);
   }

   void deposit()
   {
     System.out.println("Enter the amount you want to deposit");
     depo=obj.nextInt();

     bal=bal+depo;

     System.out.println("Your Total Balance after deposit is:" +bal);
   }
  
   void withdraw()
   {
     System.out.println("Enter the amount you want to withdraw");
     wdrl=obj.nextInt();
  
     if(wdrl<=bal)
     {
       System.out.println("You have withdraw Rs" +wdrl);
       bal=bal-wdrl;
       System.out.println("Your remaining balance in account is:" +bal);
     }
     else
       System.out.println("Insufficient Balance. Your Total Balance is:" +bal);
   } 
}

class Saving extends BankAccount                //Sub inherit class
{
  float in,rate;
  int month;
  
   void input()
  {
    super.input();
    System.out.println("Enter rate of interest");
    rate=obj.nextFloat();
    System.out.println("Enter month");
    month=obj.nextInt();
  }

   void interest()
  {
    in=bal*rate/100*month/12;
    System.out.println("Amount of interest is" +in);
  }
}

class InherBank
{
  public static void main(String args[])
   {
     int ch=0;
     Scanner sc=new Scanner(System.in);
     Saving s=new Saving();
     System.out.println("WELCOME TO SBI BANK");
     System.out.println("Please Enter Your Details");

     s.input();
   
     do
     { 
       System.out.println("Enter your choice");

       System.out.println("Press 1 for display");
       System.out.println("Press 2 for deposit");  
       System.out.println("Press 3 for withdraw");
       System.out.println("Press 4 for interest");
       ch=sc.nextInt();

        switch(ch)
       {
        case 1:s.display();
        break;
        case 2:s.deposit();
        break;
        case 3:s.withdraw();
        break;
        case 4:s.interest();
        break;

        default:System.out.println("Invalid choice!!!");
       }

        System.out.println("\n Press 0 to go to main menu again and any other key to exit");
  
        ch=sc.nextInt();
     }  while(ch==0);
   }
}  








