import java.util.Scanner;

public class P6IfElseProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = 21;
        if(age >= 18){
            System.out.println("Your are eligible for voting");
        }
        else{
            System.out.println("Your are not eligible for voting");
        }
    }
}
