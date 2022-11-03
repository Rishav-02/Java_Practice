import java.util.Scanner;

class NetAmount
{
     public static void main(String args[])
      {
        double amount,discount=0.0,netamount=0.0;
        char type;
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the Amount of Purchase:");
        amount=obj.nextDouble();

        System.out.println("Enter the Type of Purchase");

        System.out.println("L-for Mill cloth or D-for Handloom cloth:");
        type=obj.next().charAt(0);

   
           switch(type)
           {
                    case 'L':
                    if(amount>=0&&amount<=100)
                    discount=0;
                    else if(amount>=101&&amount<=200)
                    discount=amount*5.0/100;
                    else if(amount>=201&&amount<=300)
                    discount=amount*7.5/100;
                    else if(amount>300)
                    discount=amount*10.0/100;
                    break;

                    case 'D':
                    if(amount>=0&&amount<=100)
                    discount=amount*5.0/100;
                    else if(amount>=101&&amount<=200)
                    discount=amount*7.5/100;
                    else if(amount>=201&&amount<=300)
                    discount=amount*10.0/100;
                    else if(amount>300)
                    discount=amount*15.0/100;
                    break;

                    default: 
                    System.out.println("Invalid choice");
           }
           netamount=amount-discount;

           System.out.println("Discount Amount: "+discount);
           System.out.println("Net Amount You have to pay is: "+netamount);
      }
}



                    

                    

   

                    
           
       


          

                    

                    
             
        
       