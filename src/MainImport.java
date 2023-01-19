import java.io.IOException;

public class MainImport {
    private UserInput userInput;
    private DataBase dataBase;
    private Import1 import1;
    private Import2 import2;

    public MainImport(DataBase dataBase) {
        this.dataBase = dataBase;
        userInput = new UserInput();
    }

    public MainImport() {
        dataBase = new DataBase();
        userInput = new UserInput();
    }

    public void downloadPhonebook() throws IOException {
        while (true) {
            new Printer(new Text().getMenuReaderStart()).print();
            userInput.UInput(new Text().getInstruction1());
            if (userInput.getInput().equals("1")) {
                import1 = new Import1();
                import1.readFile();
                import1.ghostData();
                this.dataBase.setDataBase(import1.getData());
                new Printer(new Text().getPhonebookUpdate()).print();
                break;
            } else if (userInput.getInput().equals("2")) {
                Import2 import2 = new Import2();
                import2.readFile();
                import2.ghostData();
                this.dataBase.setDataBase(import2.getData());
                new Printer(new Text().getPhonebookUpdate()).print();
                break;
            } else if (userInput.getInput().equals("3")) {
                new Printer(new Text().getInstruction2()).print();
                break;
            } else {
                new Printer(new Text().getInstruction3()).print();
            }
        }
    }
}