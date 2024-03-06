import java.util.Scanner;
public class dowhilereversenum {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
        int r=0;
        int b;
        do
        {
            b=a%10;
            r=r*10+b;
            a=a/10;
        
        }while(a>0);
        System.out.println(r);
        
        
        
      
    }
}
