import java.util.Scanner;

class SchoolReport
{

public static void main(String[]args)

{

Scanner sc=new Scanner(System.in);
System.out.println("Enter School Name");
String sname=sc.nextLine();
System.out.println(" Enter Affiliation");
String Affiliation=sc.nextLine();
System.out.println("Enter student name");
String stuname=sc.nextLine();
System.out.println("Enter roll number");
int roll=sc.nextInt();
System.out.println("Enter the date ");
String date=sc.nextLine();
System.out.println("Enter the Section ");
String section=sc.nextLine();
System.out.println("Enter the Exam name");
String examname=sc.nextLine();
System.out.println("Enter the Physics Marks");
int physics=sc.nextInt();
System.out.println("Enter the Maths Marks");
int Maths=sc.nextInt();
System.out.println("Enter the CS Marks");
int CS=sc.nextInt();
System.out.println("Enter the Geography Marks");
int geo=sc.nextInt();
System.out.println("Enter the history Marks");
int his=sc.nextInt();
int obtained_marks=Maths+CS+geo+his+physics;
int total_marks=500;
int per = (obtained_marks*100)/total_marks;

char grade=(per<=100&&per>=85)?('A'):((per<85&&per>=65)?('B'):((per<65&&per>=45)?('C'):((per<45&&per>=35)?('E'):('F'))));

String remark=(grade=='A')?("Very Good"):((grade=='B')?("Good"):((grade=='C')?("Need to improve"):((grade=='E')?("Work hard"):((grade=='F')?("Need Not to improve"):("Fail")))));


System.out.println("_____________________________________________________________________________________________________________________________________");
System.out.println("                                                      "+sname);
System.out.println("                                                  "+Affiliation);
System.out.println("Name :"+stuname+"                                                                                                       Date :"+date);
System.out.println("Roll Num :"+roll+"                                Section"+section+"                                                    Exam :"+examname);
System.out.println("_______________________________________________________________________________________________________________________________________");
System.out.println(" Subject                                            Total Marks                                                          Marks Obtained");
System.out.println(" Physics                                                100                                                                    "+physics);
System.out.println(" Maths                                                  100                                                                    "+Maths);
System.out.println(" History                                                100                                                                    "+his);
System.out.println(" Geography                                              100                                                                    "+geo);
System.out.println(" Cs                                                     100                                                                    "+CS);
System.out.println("_________________________________________________________________________________________________________________________________________");
System.out.println("                                       Total Marks :"+total_marks+"                                           Marks Obtained"+obtained_marks);
System.out.println("_______________________________________________________________________________________________________________________________________");
System.out.println("Percentage"+per+"                                                                                                               Grade"+grade);
System.out.println("Remark :"+remark+"                                                                                                                Sign:AVK");



}
}




