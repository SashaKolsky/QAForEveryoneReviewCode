public class Runner {

    public static void main(String[] args) {
        Person person = new Person("abcdef", "alkaz.12-3akoff@gmail.com", "415-123-4567");

        if (person.isFirstNameValid()) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is not valid");
        }

        if (person.isEmailValid()) {
            System.out.println("Email is valid");
        } else {
            System.out.println("Email is not valid");
        }
    }

}
