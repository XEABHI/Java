import java.util.Scanner;

class BuzzFind
{

public static void main(String[]args)
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");

int a=sc.nextInt();

String result=(a<=99&&a>=10)?((a%7==0||a%10==7)?("Buzz"):("Not Buzz")):("Invalid");

System.out.println(result);
}
}