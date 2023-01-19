import java.util.ArrayList;

public class ContactSearcher extends Contact{
    private Contact finder = new Contact();
    private UserInput u = new UserInput();
    private ArrayList<Contact> dataBase;
    private ArrayList<Contact> findContact;
    public UserInput getU() {
        return u;
    }

    public ArrayList<Contact> getDataBase() {
        return dataBase;
    }


    public Contact getFinder() {
        return finder;
    }

    public ContactSearcher(ArrayList<Contact> dataBase) {
        super();
        this.dataBase = dataBase;
        this.findContact = new ArrayList<>();
    }

    public ContactSearcher(){
        super();
        this.dataBase = new ArrayList<>();
        this.findContact = new ArrayList<>();
    }

    public void setFinder(Contact finder) {
        this.finder = finder;
    }

    public void setU(UserInput u) {
        this.u = u;
    }

    public void setDataBase(ArrayList<Contact> dataBase) {
        this.dataBase = dataBase;
    }

    public ArrayList<Contact> getFindContact() {
        return findContact;
    }
    public void setFindContact(ArrayList<Contact> findContact) {
        this.findContact = findContact;
    }

    public void showContact(ArrayList<Contact> data, int num) {
        for (Contact c: data
        ) {
            if (num == 1) {
                if (this.finder.getName().getFirstName().equals(c.getName().getFirstName().toLowerCase())) {
                    new PrinterContact(c).printCtc();
                    this.findContact.add(c);
                }
            } else if (num == 2) {
                if (this.finder.getName().getLastName().equals(c.getName().getLastName().toLowerCase())) {
                    new PrinterContact(c).printCtc();
                    this.findContact.add(c);
                }
            } else if (num == 3) {
                if (    c.getNumber().getNumberHome() == this.finder.getNumber().getNumberHome() ||
                        c.getNumber().getNumberMobile() == this.finder.getNumber().getNumberHome() ||
                        c.getNumber().getNumberWork() == this.finder.getNumber().getNumberHome()) {
                    new PrinterContact(c).printCtc();
                    this.findContact.add(c);
                }
            }
        }
        if (this.findContact.size() == 0) { // если нет совпадений посика , пишет об этом пользователю в консоль
            new Printer(new Text().getContactNotFound()).print();
        }
    }

    public void addFindContact() {
        while (true) {
            new Printer(new Text().getMenuFinderStart()).print();
            u.UInput(new Text().getInstruction1());
            if (u.getInput().equals("1")) {
                u.UInput(new Text().getEnterFName());
                finder.getName().setFirstName(u.getInput().toLowerCase());
                this.showContact(dataBase,1);
                break;
            } else if (u.getInput().equals("2")) {
                u.UInput(new Text().getEnterLName());
                finder.getName().setLastName(u.getInput().toLowerCase());
                showContact(dataBase,2);
                break;
            } else if (u.getInput().equals("3")) {
                u.UInput(new Text().getEnterNumber());
                if (u.isInteger()) {
                    finder.getNumber().setNumberHome(Integer.parseInt(u.getInput().toLowerCase()));
                    showContact(dataBase,3);
                    break;
                } else {
                    new Printer(new Text().getIsNotNumber()).print();
                }
            } else if (u.getInput().equals("4")) {
                new Printer(new Text().getInstruction2()).print();
                break;
            } else {
                new Printer(new Text().getInstruction3()).print();
            }
        }
    }
}