import java.util.Scanner;

class BankAccount
{
  public static void main(String args[])
      {
        int acc_Type,balance=20000,deposit,withdraw,ch;
        long acc_Num,Aadhar_No;
        Scanner in=new Scanner(System.in);

      //Taking customer Details to check his/her Identity

        System.out.println("\n Welcome to Bank, Please Enter your Bank Details:\n ");
        System.out.println("Enter your Account Number:");
        acc_Num=in.nextLong();
        System.out.println("\n Press 1 for Current Account or Press 2 for Saving Account");
        acc_Type=in.nextInt();
        System.out.println("Enter your Aadhar Number:");
        Aadhar_No=in.nextLong();
        System.out.println("Thanks for Entering Details Now You Can:");

     //Giving Customer menu-driven choice

        do
        {
           System.out.println("\n Press 1 to check Balance");
           System.out.println("Press 2 to deposit an Amount");
           System.out.println("Press 3 to withdraw Amount");
           System.out.println("Press 4 to see your Account Details");
           ch=in.nextInt();

         switch(ch)
         {
             //Balance Check
            case 1: System.out.println("Total Balance in your account is :"+balance);
                    break;
            //Deposit Amount
            case 2: System.out.println("Enter the Amount You want to Deposit and put the cash in the machine");
                    deposit=in.nextInt();
                    balance=balance+deposit;
                    System.out.println("You have deposited RS"+deposit+"and Your Current Balance is RS"+balance);
                    break;
           //Withdrawing Amount
            case 3: System.out.println("Enter the Amount you want to withdraw");
                    withdraw=in.nextInt();
           
                    if(withdraw<=balance)
                     {
                       System.out.println("You have withdraw RS"+withdraw+"from your Account");
                       balance=balance-withdraw;
                       System.out.println("Remaining balance in account is:"+balance);
                     }
                    else
                       System.out.println("Insufficient balance. your total balance is:"+balance);
                       break;
          //Customer Account Details
            case 4: System.out.println("\n your account details are\n");
                    System.out.println("account number:"+acc_Num);
       
                    if(acc_Type==1)
                    System.out.println("you have:Current Account");
                    else if(acc_Type==2)
                    System.out.println("you have:Saving Account");

                    else 
                    System.out.println("Unknown type of account");
                    System.out.println("Aadhar No linked to your Account is:"+Aadhar_No);
                    System.out.println("Total amount in your account is"+balance);
                    break;

           default: System.out.println("Invalid choice!!!");
         }
         //If customer want to go to main menu
           System.out.println("\n Press 9 to go to main menu again and anyother number key to exit");
           ch=in.nextInt();
        }  while(ch==9);
      }
} 