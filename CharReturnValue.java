class CharReturnValue {
    public static void main(String[]crv)
    {
        char v='A';//Ascii value convert into binary then add
        int b=v+10;
        //short d=v+10; Type mismatch: cannot convert from int to shortJava
        //byte e=v+10; Type mismatch: cannot convert from int to shortJava
        System.out.println(b);
    }
}
/*1) Compile time = Success;
  2) Run time = Success = 75;
 */
