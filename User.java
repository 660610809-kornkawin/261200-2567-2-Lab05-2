import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;
    // Create a new field using protected
    protected LocalDate today = LocalDate.now();

// contructor --> no parameter
    User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

// contructor --> with parameter
    User(String name, int year , int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year,month,day);
    }

    // Check if today is user's birthday
    // .getMonth() --> To get month
    // .getDayOfMonth() --> To get day of month
    public boolean isBirthday(){
        if (today.getMonth() == dob.getMonth() && today.getDayOfMonth() == dob.getDayOfMonth()){
            return true;
        }else{
            return false;
        }
    }

    //wish happy birthday to user
    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }

    // Display user's name and birthday
    public void displayInfo(){
        System.out.println(name);
        System.out.println(dob);
    }
}
