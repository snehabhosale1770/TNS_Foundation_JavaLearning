public class P3dtatypeRanges {
    public static void main(String[] args) {

         byte byteMax = 127;
         byte byteMin = -128;
        System.out.println("Max Range of byte is : " + byteMax);
        System.out.println("Min Range of byte is : " + byteMin);

        short shortMax = 32767;
        short shortMin = -32768;
        System.out.println("Max Range of short is : " + shortMax);
        System.out.println("Min Range of short is : " + shortMin);

        int intMax = 214748364;
        int intMin = -2147483368;
        System.out.println("Max Range of int is : " + intMax);
        System.out.println("Min Range of int is : " + intMin);

        long longMax = 922337203685477580L;
        long longMin = -9223372036854775808L;
        System.out.println("Max Range of long is : " + longMax);
        System.out.println("Min Range of long is : " + longMin);
    }
}
