import java.util.Scanner;
public class ExampleOddEvenDigitdowhile {
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int even=0;
        int odd=0;
        do
        {
            int r=a%10;
            if(r%2==0)
            {
                even++;
        
            }
            else
            {
                odd++;
            }
        a=a/10;
        }while(a>0);

    System.out.println("The Number of Odd Digit :" +odd+ " The Number of Even Digit :" +even);
    }
}
