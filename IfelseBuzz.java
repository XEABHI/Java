import java.util.Scanner;
public class IfelseBuzz {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        
        int a =sc.nextInt();

        if(a>=10&&a<=99)
        {
            if(a%7==0|a%10==7)
            {
                System.out.println("Number is Buzz");
            }
        }

        else
        {
            System.out.println("Number is not buzz");
        }
    }
}
