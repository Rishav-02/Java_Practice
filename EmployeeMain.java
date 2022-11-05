import java.util.Scanner;

class Personal
{
  String Name;
  int Pan;long acc_no;
  double basic_pay;
  
  Scanner sc=new Scanner(System.in);

  Personal(String a,int b,long c,double d)
    {
     Name=a;
     Pan=b;
     acc_no=c;
     basic_pay=d;
    }

  void display()
   {
    System.out.println("Enter employ name");
    Name=sc.nextLine();
    System.out.println("Enter employ Pan no");
    Pan=sc.nextInt();
    System.out.println("Enter employ basic salary");
    basic_pay=sc.nextDouble();
    System.out.println("Enter employ acc no");
    acc_no=sc.nextLong();
     
   }
}

class Retire extends Personal
{
  double Yrs,Pf,Grat;
  Retire(String a,int b,long c,double d,double e)
  {
   super(a,b,c,d);
   Yrs=e;
  }

  void provident()
  {
   Pf=(2/100.0d*basic_pay)*Yrs;
   System.out.println("Provident fund amount(Pf): Rs" +Pf);
  }

   void gratuity()
   {
    if(Yrs>=10)
     {
       Grat=12*basic_pay;
       System.out.println("Gratuity amount: Rs" +Grat);
     }

    else
        System.out.println("Gratuity amount is Nil");   
   }

  void display1()
  {
   display();
   System.out.println("Year of Service: "+Yrs);
   provident();
   gratuity();
  }
}
 class EmployeeMain
{

   public static void main(String args[])
  {  
   
   Retire reti1= new Retire("RishaV",1234567890,80476659L,50000.0d,8.0d);

   reti1.display1(); 
  }
}
   
   
   
  

    

  

  