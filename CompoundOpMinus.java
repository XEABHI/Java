public class CompoundOpMinus {
    public static void main(String[] args) {
        int age=19;
        double age1=20;

       /*age=age-age1; Comile Time Error
        System.out.println(age);*/

        age-=age1;
        System.out.println(age);
    }
}

/*1) Compile time = Success;
  2) Run time = Success = -1
  ;
 */

