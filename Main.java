import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        User john = new User("john", 1962, 12, 18);
        Admin nicolas = new Admin("nicolas", 2000, 12, 18);

//        john.displayInfo();
//        nicolas.displayInfo();
//
//        nicolas.displayInfo(true);
//        System.out.println();
//        nicolas.displayInfo(false);
        john.displayHappyBirthday();
        nicolas.displayHappyBirthday();
    }
}