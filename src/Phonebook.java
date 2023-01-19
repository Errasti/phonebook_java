import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;

public class Phonebook  implements Comparator<Contact>, Iterable<Contact> {

    private DataBase dataBase;
    private AddNewContact newContact;
    private ContactSearcher contactSearcher;
    private Import2 import2 = new Import2();
    private Import1 import1 = new Import1();
    private ContactRemover contactRemover;
    private ChangeContact changeContact;

    public AddNewContact getNewContact() {
        return newContact;
    }

    public void setNewContact(AddNewContact newContact) {
        this.newContact = newContact;
    }

    public ContactSearcher getFinderContact() {
        return contactSearcher;
    }

    public void setFinderContact(ContactSearcher contactSearcher) {
        this.contactSearcher = contactSearcher;
    }

    public Import2 getReader2() {
        return import2;
    }

    public void setReader2(Import2 import2) {
        this.import2 = import2;
    }

    public Import1 getReader1() {
        return import1;
    }

    public void setReader1(Import1 import1) {
        this.import1 = import1;
    }

    public ContactRemover getDeleterContact() {
        return contactRemover;
    }

    public void setDeleterContact(ContactRemover contactRemover) {
        this.contactRemover = contactRemover;
    }

    public ChangeContact getChangeContact() {
        return changeContact;
    }

    public void setChangeContact(ChangeContact changeContact) {
        this.changeContact = changeContact;
    }

    public Phonebook(ArrayList<Contact> data) throws FileNotFoundException {
        this();
        this.dataBase = new DataBase(data);
    }

    public Phonebook(DataBase dataBase) throws FileNotFoundException {
        this();
        this.dataBase = new DataBase(dataBase);
    }

    public Phonebook() throws FileNotFoundException {
        import1 = new Import1();
        import2 = new Import2();

    }

    @Override
    public int compare(Contact o1, Contact o2) {
        if (o1.getName().getFirstName().toLowerCase().equals(o2.getName().getFirstName().toLowerCase()) &&
                o1.getName().getLastName().toLowerCase().equals(o2.getName().getLastName().toLowerCase())  &&
                o1.getNumber().getNumberHome() == o2.getNumber().getNumberHome()  &&
                o1.getNumber().getNumberWork() == o2.getNumber().getNumberWork()  &&
                o1.getNumber().getNumberMobile() == o2.getNumber().getNumberMobile()  &&
                o1.getDateOfBirth() == o2.getDateOfBirth()
        ) {
            return 0;
        }
        return 1;
    }

    @Override
    public Iterator<Contact> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Contact> action) {
        Iterable.super.forEach(action);
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}