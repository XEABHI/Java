public class Narrowing {
    public static void main(String[] args) {
        float temp=15.26f;
       /*byte city_temp=temp; Compile time error */
        byte city_temp1=(byte)temp;// Compile Time Successful

        System.out.println(city_temp1);
    
    }
}

/*1) Compile time = Success;
  2) Run time = Success = 15;
 */