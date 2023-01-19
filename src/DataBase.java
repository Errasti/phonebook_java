import java.util.ArrayList;
import java.util.Collection;

public class DataBase extends ArrayList<Contact> {
    private ArrayList<Contact> dataBase = new ArrayList<Contact>();


    public DataBase(int initialCapacity, ArrayList<Contact> dataBase) {
        super(initialCapacity);
        this.dataBase = dataBase;
    }


    public DataBase(ArrayList<Contact> dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase(Collection<? extends Contact> c, ArrayList<Contact> dataBase) {
        super(c);
        this.dataBase = dataBase;
    }

    public ArrayList<Contact> getDataBase() {
        return dataBase;
    }

    public void setDataBase(ArrayList<Contact> dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase() {

    }

}
