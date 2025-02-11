package P20GetterSetter;

public class TestGetSetter {

    public static void main(String[] args) {
        P20GetterSetter P1=new P20GetterSetter();
        P1.setName("Sneha");
        P1.setpCity("Pune");
        System.out.println(P1);
        P20GetterSetter P2=new P20GetterSetter("Amruta","Kolhapur");
        System.out.println(P2);
}

}
