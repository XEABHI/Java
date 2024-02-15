class ShortReturnValue {
    
    public static void main(String[]srv) {

        short v1=1;
        short v2=1;
       /* short v3=v1+v2; size of short is less */
        int v3=v1+v2;
        System.out.println(v3);
        
    }
}

/*1) Compile time = Success;
  2) Run time = Success = 2;
 */