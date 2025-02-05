public class P9operator {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("a and b values befor the " + " operator : " + a + " " + b);
        ++a; // preIncrement the a

        int c = ++a + b + a--; // 12  20  12
        System.out.println("value of c is : " + c);

        int d = c++ + a + b--; // 44   11  19
        System.out.println("value of c is : " + d);
    }
}
