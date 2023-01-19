import java.io.IOException;

public class MainExport {
    private DataBase dataBase;
    private Export1 export1;
    private Export2 export2;
    private UserInput userInput;

    public MainExport() {
    }

    public MainExport(DataBase dataBase) {
        this.dataBase = dataBase;
        userInput = new UserInput();
    }

    public void selectWriter() throws IOException {
        while (true) {
            new Printer(new Text().getMenuWriterStart()).print();
            userInput.UInput(new Text().getInstruction1());
            if (userInput.getInput().equals("1")) {
                export1 = new Export1(this.dataBase);
                export1.recordMyPhonebook();
            } else if (userInput.getInput().equals("2")) {
                export2 = new Export2(this.dataBase);
                export2.recordMyPhonebook();
            } else if (userInput.getInput().equals("3")) {
                new Printer(new Text().getInstruction2()).print();
                break;
            } else {
                new Printer(new Text().getInstruction3()).print();
            }
        }
    }
}

