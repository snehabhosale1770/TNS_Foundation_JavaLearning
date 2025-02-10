public class P17taxCalculate {

    // function to calculate the tax
    public void calculateTax (Person person){

        // female FEMALE Female FeMale
        if(person.getAge () > 65 || person.getGender ().equalsIgnoreCase("female")){
            person.setTax(0);
            System.out.println("Tax not applicable");
        }
        else{
            if (person.getIncome() <= 200000){
                person.setTax(0);
            }
            else if (person.getIncome() > 200000 && person.getIncome() <= 500000) {
                person.setTax((person.getIncome() - 200000) * 20/100 );
            }
            else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {
                person.setTax((person.getIncome() - 200000) * 20/100 + 30000 );
            }
            else {
                person.setTax((person.getIncome() - 800000) * 30/100 + 90000);
            }
        }
    }
}
