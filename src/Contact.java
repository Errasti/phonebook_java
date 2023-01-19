public class Contact extends Human {
    private Number number = new Number();
    private Commentary commentary = new Commentary();

    public Contact(Number number) {
        this.number = number;
    }

    public Contact(String firstName, String lastName, String date, int number, String commentary) {
        super.getName().setFirstName(firstName);
        super.getName().setLastName(lastName);
        super.setDateOfBirth(date);
        this.number.setNumberHome(number);
        this.commentary.setComment(commentary);
    }

    public Contact(String firstName, String lastName, String date, int number, int number2, int number3, String commentary) {
        this(firstName, lastName, date, number, number2, commentary);
        this.number.setNumberWork(number3);
    }

    public Contact(String firstName, String lastName, String date, int number, int number2, String commentary) {
        this(firstName, lastName, date, number, commentary);
        this.number.setNumberMobile(number2);

    }

    public Contact() {

    }

    public Commentary getCommentary() {
        return commentary;
    }

    protected Number getNumber() {
        return this.number;
    }
}