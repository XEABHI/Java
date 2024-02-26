import java.util.Scanner;

class SchoolReportCard
{

public static void main(String[]args)

{

Scanner sc=new Scanner(System.in);

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


System.out.println("Physics Marks:"+physics);
System.out.println("Maths Marks:"+Maths);
System.out.println("CS Marks:"+CS);
System.out.println("Geography Marks:"+geo);
System.out.println("History Marks:"+his);

int obtained_marks=Maths+CS+geo+his;

int total_marks=500;

int per=(obtained_marks*100)/total_marks;

char grade=(per<=100&&per>=85)?('A'):((per<85&&per>=65)?('B'):(per<65&&per>=45)?('C'):(per<45&&per>=35)?('E'):('F'));

String remark=(grade=='A')?("Very Good"):((grade=='B')?("Good"):(grade=='C')?("Need to improve):(grade=='E')?("Work hard):(grade=='F')?("Need Not to improve));

System.out.println("Remark is:"+remark);

System.out.println("Obtained Marks :"+obtained_marks);

System.out.println("Total Marks are :"+total_marks);

System.out.println("Percentage :"+per);

System.out.println("Grade is:"+grade);






}
}




