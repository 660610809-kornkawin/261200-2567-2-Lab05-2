import java.time.LocalDate;

public class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    public void displayInfo(boolean full) {
        if (full) {
            displayInfo();
        } else {
            System.out.println(super.name);
        }
    }

    public void displayHappyBirthday() {
        // .getYear --> To get year
        super.today.getYear(); // Today's year: 2024 or current year
        super.dob.getYear(); // Dob's year: Birthday's year
        int age = today.getYear() - dob.getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + super.name + "! You are " + age + "!");
        }
    }
}