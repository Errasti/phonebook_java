import java.util.ArrayList;

public class ChangeContact extends ContactSearcher {

    public ChangeContact(ArrayList<Contact> dataBase) {
        super(dataBase);
    }

    public ChangeContact() {
        super();
    }

    public void changeContact() {
        for (Contact c:
                getFindContact()
        ) {
            while (true) {
                new Printer(new Text().getCurrentField()).print();
                new PrinterContact(c).printCtc();
                new Printer(new Text().getMenuChange()).print();
                super.getU().UInput(new Text().getInstruction1());
                if (super.getU().getInput().equals("1")) {
                    super.getU().UInput(new Text().getInputNewFName());
                    c.getName().setFirstName(super.getU().getInput());
                } else if (super.getU().getInput().equals("2")) {
                    super.getU().UInput(new Text().getInputNewLName());
                    c.getName().setLastName(super.getU().getInput());
                } else if (super.getU().getInput().equals("3")) {
                    while (true) {
                        super.getU().UInput(new Text().getInputNewDBirthDay());
                        if (super.getU().isDate()) {
                            c.setDateOfBirth(super.getU().getInput());
                            break;
                        } else {
                            new Printer(new Text().getIsNotDate()).print();
                        }
                    }
                } else if (super.getU().getInput().equals("4")) {
                    while (true) {
                        super.getU().UInput(new Text().getInputNewHomeNumber());
                        if (super.getU().isInteger()) {
                            c.getNumber().setNumberHome(Integer.parseInt(super.getU().getInput()));
                            break;
                        } else {
                            new Printer(new Text().getIsNotNumber()).print();
                        }
                    }
                } else if (super.getU().getInput().equals("5")) {
                    while (true) {
                        super.getU().UInput(new Text().getInputNewMobileNumber());
                        if (super.getU().isInteger()) {
                            c.getNumber().setNumberMobile(Integer.parseInt(super.getU().getInput()));
                            break;
                        } else {
                            new Printer(new Text().getIsNotNumber()).print();
                        }
                    }
                } else if (super.getU().getInput().equals("6")) {
                    while (true) {
                        super.getU().UInput(new Text().getInputNewWorkNumber());
                        if (super.getU().isInteger()) {
                            c.getNumber().setNumberWork(Integer.parseInt(super.getU().getInput()));
                            break;
                        }
                    }
                } else if (super.getU().getInput().equals("7")) {
                    super.getU().UInput(new Text().getInputNewComment());
                    c.getCommentary().setComment(super.getU().getInput());
                } else if (super.getU().getInput().equals("8")) {
                    new Printer(new Text().getInstruction2()).print();
                    break;
                } else {
                    new Printer(new Text().getInstruction3()).print();
                }
            }
        }
    }
}
