import java.util.Scanner;

public class PersonDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter The person name");
        String name = input.next();
        System.out.println("Enter the age of person");
        int age = input.nextInt();
        System.out.println("Enter the gender of person");
        String gender = input.next();
        System.out.println("Enter the Income of person");
        int income = input.nextInt();

        // person object
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setGender(gender);
        person.setIncome(income);

        P17taxCalculate calculate = new P17taxCalculate();
        calculate.calculateTax(person);
    }
}
