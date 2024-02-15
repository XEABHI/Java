public class CompoundOp {
    public static void main(String[] args)
     {
        int age=10;
        double age1=2.8;
        
        /*age=age+age1; Comile Time Error
        System.out.println(age);*/

        age+=age1;
        System.out.println(age);

    }
}

/*1) Compile time = Success;
  2) Run time = Success = 12;
 */
