import java.util.Scanner;

class CompareCharAscii
{

public static void main(String[]args)
{

char a1='A';

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number");

int j=sc.nextInt();

String result=(j==a1)?("It's Matched"):("Its Not Matched");

System.out.println(result);


}
}