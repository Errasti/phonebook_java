import java.io.FileNotFoundException;

public class PrinterPhonebook extends Phonebook {


    public PrinterPhonebook() throws FileNotFoundException {
        super();
    }

    public void printPB(DataBase dataBase) {
        new Printer("").print();
        new Printer("Состояние текущей базы данных: ").print();
        new Printer("===============*******===============").print();
        for (Contact c : dataBase.getDataBase()
        ) {
            new PrinterContact(c).printCtc();
        }
        new Printer("===============*******===============").print();
    }

}