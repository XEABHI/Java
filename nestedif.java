import java.util.Scanner;
public class nestedif {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");

        int num=sc.nextInt();

        if(num>=10&&num<=99)
        {
            if(num%2==0)
            {
                System.out.println("Even");
            }

            else
            {
                System.out.println("Odd");
            }
        }

        else
        {
            System.out.println("Plz Enter two digit Number");
        }


    }
}
