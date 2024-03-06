import java.util.Scanner;
public class dowhile {
    




    public static void main(String[] args) {

        System.out.println("Enter the Number :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        
        do
        {
            int b=a%10;
            System.out.println(b);
            a=a/10;
        }while(a>0);
        
    }
}
