public class Person {

    private String firstname;
    private String surname;

    public Person(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }


    @Override
    public String toString() {
        return "firstname " + firstname + " surname " + surname;
    }
}
