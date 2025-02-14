package P23StaticMethodVariable;

public class TestStatic {

    public static void main(String[] args) {
        P23StaticKeyword.display();
        P23StaticKeyword p=new  P23StaticKeyword();
        System.out.println(p);

        P23StaticKeyword.display();
        P23StaticKeyword p2=new  P23StaticKeyword();
        System.out.println(p2);
}

}
