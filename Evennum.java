public class Evennum {
    public static void main(String[] args) {
        int a=10;
        int b=12;

        int c=a+b;
        int d=c%10;
        int e=c/10;
        int result=d+e;

        String result1=result%2==0?("even"):("odd");
        System.out.println(result1);

    }
}

   /*1) Compile time = Success;
  2) Run time = Success = even;
 */
