public class P4typeCasting {
    public static void main(String[] args) {

        // Widening / Implicit type casting
        byte b = 10;
        int l = b;
        System.out.println(l);

        float f = 100/3f;
        double d = f;
        System.out.println(d);

        char ch = 'a';
        int i = ch;
        System.out.println(i);

        // Narrowing / Explicit type casting
        double f1 = 10.4356f;
        long l1 = (long) f1;
        System.out.println(l1);

        long abc = 134526798l;
        int i1 = (int) abc;
        System.out.println(i1);

        int xyz = 130;
        byte pqr = (byte) xyz;
        System.out.println(pqr);
    }
}
