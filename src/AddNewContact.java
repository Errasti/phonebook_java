import java.util.ArrayList;

public class AddNewContact extends Contact {
    private UserInput userInput;

    public UserInput getuInCon() {
        return userInput;
    }

    public void setuInCon(UserInput userInput) {
        this.userInput = userInput;
    }

    public AddNewContact(String firstName, String lastName, String date, int number, String commentary) {
        super(firstName, lastName, date, number, commentary);
        this.userInput = new UserInput();
    }

    public AddNewContact(String firstName, String lastName, String date, int number1, int number2, int number3, String commentary) {
        super(firstName, lastName, date, number1, number2, number3, commentary);
        this.userInput = new UserInput();
    }

    public AddNewContact(String firstName, String lastName, String date, int number1, int number2, String commentary) {
        super(firstName, lastName, date, number1, number2, commentary);
        this.userInput = new UserInput();
    }

    public AddNewContact() {
        this.userInput = new UserInput();
    }

    public void add(ArrayList<Contact> data) {
        data.add(this);
    }

    public void enterNewContact() {
        userInput.UInput(new Text().getEnterFName());
        super.getName().setFirstName(userInput.getInput());
        userInput.UInput(new Text().getEnterLName());
        super.getName().setLastName(userInput.getInput());
        while (true) {
            userInput.UInput(new Text().getEnterDateBtsd());
            if (userInput.isDate()) {
                super.setDateOfBirth(userInput.getInput());
                break;
            } else {
                new Printer(new Text().getIsNotDate()).print();
            }
        }
        while (true) {
            userInput.UInput(new Text().getEnterNumber());
            if (userInput.isInteger()) {
                super.getNumber().setNumberHome(Integer.parseInt(userInput.getInput()));
                break;
            } else {
                new Printer(new Text().getIsNotNumber()).print();
            }
        }
        userInput.UInput(new Text().getEnterComment());
        super.getCommentary().setComment(userInput.getInput());
    }
}