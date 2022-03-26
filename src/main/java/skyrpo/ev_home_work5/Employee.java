package skyrpo.ev_home_work5;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
        public String toString() {
            return "Имя: " + this.firstName + "  " + this.lastName;
        }
}
