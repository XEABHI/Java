class byteReturnValue 
{
    public static void main(String[] brv) {
        byte v=10;
        byte v1=34;
       /* byte v2=v+v1; its exceeding th limit of byte 127 so it will throw error byte should return in int*/
/* Addition is in Interger*/ int v2=v+v1;
        System.out.println(v2);
    }
}
/*1) Compile time = Success;
  2) Run time = Success = 44;
 */
