public class WideningTyeCast {
    public static void main(String[] args)
     {
        int a=10;  // Implicit Type casting
        float b=a;
        System.out.println(b);

        int a1=10;  // Explicit Type Casting
        float b1=(float)a1;
        System.out.println(b1);
    }
}

/*1) Compile time = Success;
  2) Run time = Success = 10.0;
                          10.0
 */
