import java.util.Scanner;
public class dowhileeven {
    


    public static void main(String[] args) {
        
        System.out.println("Enter the Number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        do
        {
            int b=a%10;
            if (b%2==0) {
                System.out.println("Even");
                System.out.println(b);
            }
            a=a/10;
        }while(a>0);

       
        
    }
}
