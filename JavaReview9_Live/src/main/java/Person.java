public class Person {

    private String firstName;
    private String email;
    private String phoneNumber;

    public Person(String firstName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public boolean isEmailValid() {
        return email.matches("[\\w.-]+@[\\w]+.[a-z]{2,}");
    }

    public boolean isFirstNameValid() {
        return firstName.matches("[A-Za-z]+");
    }

}
