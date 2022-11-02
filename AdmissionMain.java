import java.util.Scanner;

class Admission
{
     Scanner obj=new Scanner(System.in);
   
     //Declaration of variable
     String name;
     int hin,eng,math,sci,bio;
     float percent,sum;

     void input()
     {
       System.out.println("Enter your name");
       name=obj.nextLine();
   
       System.out.println("Enter obtained marks in Hindi");
       hin=obj.nextInt();
 
       System.out.println("Enter obtained marks in English");
       eng=obj.nextInt();

       System.out.println("Enter obtained marks in Mathematics");
       math=obj.nextInt();

       System.out.println("Enter obtained marks in Science");
       sci=obj.nextInt();
 
       System.out.println("Enter obtained marks in Biology");
       bio=obj.nextInt();
     }

     void process()
     {
       if(hin>100||eng>100||math>100||sci>100||bio>100)
       
       System.out.println("You have entered invalid marks");

       else if(hin<45||eng<45||math<45||sci<45||bio<45)
       
       System.out.println("you are not illegible");

       sum=hin+eng+math+sci+bio;
       System.out.println("Total marks="+" "+sum);

       percent=sum/500*100;
       System.out.println("Total percenatage="+" "+percent+"%");
     }

     void meritlist()
     {
       if(percent>=80)
       System.out.println("Your name in meritlist 1");

       else if(percent<80&&percent>=60)
       System.out.println("Your name in meritlist 2");

       else
       System.out.println("Your name in meritlist 3");
     }
}
 
class AdmissionMain
{
   public static void main(String args[])
    {
       Admission obj=new Admission();
       Scanner admi=new Scanner(System.in);
       int ch;

     do
     {
      obj.input();
      obj.process();
      obj.meritlist();
 
      System.out.println("Press 0 to continue or any other key to exit");

      ch=admi.nextInt();
     }while(ch==0);
    }
}


       
       

   
     
