import java.io.IOException;

public class Application {

    public static void runApp() throws IOException {
        Import1 import1 = new Import1();
        import1.readFile();
        import1.ghostData();
        Phonebook phonebook = new Phonebook(import1.getData());
        UserInput userInput = new UserInput();
        new Printer(new Text().getGreeting()).print();
        while (true) {
            new Printer(new Text().getMenuStart()).print();
            userInput.UInput(new Text().getInstruction1());
            if (userInput.getInput().equals("1")) {
                MainImport mainImport = new MainImport(phonebook.getDataBase());
                mainImport.downloadPhonebook();
            } else if (userInput.getInput().equals("2")) {
                new PrinterPhonebook().printPB(phonebook.getDataBase());
            } else if (userInput.getInput().equals("3")) {
                ContactSearcher contactSearcher = new ContactSearcher(phonebook.getDataBase().getDataBase());
                contactSearcher.addFindContact();
            } else if (userInput.getInput().equals("4")) {
                ContactRemover contactRemover = new ContactRemover(phonebook.getDataBase().getDataBase());
                contactRemover.addFindContact();
                contactRemover.deleteContact(contactRemover.getFindContact());
            } else if (userInput.getInput().equals("5")) {
                AddNewContact newContact = new AddNewContact();
                newContact.enterNewContact();
                newContact = new AddNewContact(newContact.getName().getFirstName(), newContact.getName().getLastName(),
                        newContact.getDateOfBirth(), newContact.getNumber().getNumberHome(), newContact.getCommentary().getComment());
                newContact.add(phonebook.getDataBase().getDataBase());
            } else if (userInput.getInput().equals("6")) {
                ChangeContact changeContact = new ChangeContact(phonebook.getDataBase().getDataBase());
                changeContact.addFindContact();
                changeContact.changeContact();
            } else if (userInput.getInput().equals("7")) {
                MainExport mainExport = new MainExport(phonebook.getDataBase());
                mainExport.selectWriter();
            } else if (userInput.getInput().equals("8")) {
                new Printer(Text.getCloseApplication()).print();
                break;
            } else {
                new Printer(new Text().getInstruction3()).print();
            }
        }
    }
}