import java.util.ArrayList;

public class ContactRemover extends ContactSearcher {

    public ContactRemover(ArrayList<Contact> dataBase) {
        super(dataBase);
    }

    public void deleteContact(ArrayList<Contact> findContact) {
        for (Contact c :
                findContact
        ) {
            this.getDataBase().remove(c);
            new Printer(c.getName().getFirstName() + " " + c.getName().getLastName() + " упешно удалён!").print();
        }
    }
}