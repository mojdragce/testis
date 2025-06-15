package rs.ac.singidunum;

public class BusPlus {
    public enum Status {UNEMPLOYED, EMPLOYED, STUDENT, PREGNANT}
    public enum Gender {MALE, FEMALE}

// numMonths is less than 3, there is no discount
// If numMonths is greater or equal than 3, and less than 6, there is 5% discount
// If numMonths is 6 or more, we give 10%.
// Max numb of months 12
// If illegal number of months has been entered (negative or over 12), exception IllegalArgumentException is thrown


    // Equivalence class and boundary values testing
    public static double calculateDiscountForPayingMultipleMonthsInAdvance(int numMonths) throws IllegalArgumentException {
        if (numMonths < 0 || numMonths >= 12) throw new IllegalArgumentException();

        int discount = 0;

        if (numMonths > 3 && numMonths < 6)
            discount = 5;
        else if (numMonths > 6)
            discount = 10;
        return discount;
    }

    // Statemenet coverage...
    public static double calculateBusPlus(int age, Status status, Gender gender, boolean specialNeeds) {
        double price = 3200;

        if (status != status.EMPLOYED) {
            if (age > 65 || (gender == Gender.MALE && status == Status.UNEMPLOYED)) {
                price *= 0.5;
            } else if (status == Status.STUDENT || (gender == Gender.FEMALE && status == Status.UNEMPLOYED)) {
                price *= 0.3;
            }
            if (gender == Gender.FEMALE && status == Status.PREGNANT) {

                price *= 0.1; //there is an error here
            }
        }

        if (specialNeeds) {
            price = 0;
        }

        return price;
    }
}
