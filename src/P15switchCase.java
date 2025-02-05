public class P15switchCase {
    public static void main(String[] args) {

        char x = 'l';
        switch (x){
            case 'l' :
            case 'L' :
                System.out.println(x + " is a Leadership ");
                break;

            case 'b' :
            case 'B' :
                System.out.println(x + " is a Bootstrap ");
                break;

            case 'h' :
            case 'H' :
                System.out.println(x + " is a HTML ");
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
