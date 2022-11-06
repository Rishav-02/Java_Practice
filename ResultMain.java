import java.util.Scanner;

class College
{
  Scanner obj=new Scanner(System.in);

  String CollegeName,StudentName,CourseName;
  int Rollno;

  void cinput()
   {
     System.out.println("Enter Name of College");
     CollegeName=obj.nextLine();
 
     System.out.println("Enter Name of Student");
     StudentName=obj.nextLine();

     System.out.println("Enter Name of Course");
     CourseName=obj.nextLine();

     System.out.println("Enter Roll number of Student");
     Rollno=obj.nextInt();
   }

  void cdisplay()
  {
    System.out.println("Name of College is:" +CollegeName);
    System.out.println("Name of Student is:" +StudentName);
    System.out.println("Name of Course is:" +CourseName);
    System.out.println("Roll number of Student is:" +Rollno);
  }
}

class Result extends College
{
  int C1,C2,math;

   void rinput()
   {
     System.out.println("Enter Marks in Core 1");
     C1=obj.nextInt();
 
     System.out.println("Enter Marks in Core 2");
     C2=obj.nextInt();

     System.out.println("Enter Marks in Mathematics");
     math=obj.nextInt();
   }

   void rdisplay()
   {
     System.out.println("Marks in Core 1 is:" +C1);
     System.out.println("Marks in Core 2 is:" +C2);
     System.out.println("Marks in Mathematics is:" +math);
   }
}

class ResultMain
{
  public static void main(String args[])
  {
    Result re=new Result();

    re.cinput();
    re.rinput();
    re.cdisplay();
    re.rdisplay();
  }
}
 








