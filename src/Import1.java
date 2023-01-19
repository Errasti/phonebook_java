import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Import1 {
    private  BufferedReader reader;

    private DataBase dataBase;
    private String line;
    private ArrayList<String[]> base;
    private ArrayList<Contact> data;

    private final String file = "src/DataLine.txt";

    public ArrayList<Contact> getData() {
        return data;
    }

    public Import1() throws FileNotFoundException {
        base = new ArrayList<>();
        data = new ArrayList<>();
        this.reader = new BufferedReader(new FileReader(file));
    }

    public void readFile() throws IOException {
        try{
            while((line = reader.readLine()) != null){
                base.add(line.split(","));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }
    }

    public void setReader(BufferedReader reader) {
        this.reader = reader;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public BufferedReader getReader() {
        return reader;
    }
    public ArrayList<String[]> getBase() {
        return base;
    }

    public void ghostData() {
        for (String[] c: this.base
        ) {
            if (c.length == 7) {
                data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), Integer.parseInt(c[4]), Integer.parseInt(c[5]), c[c.length - 1]));
            } else if (c.length == 6) {
                data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), Integer.parseInt(c[4]), c[c.length - 1]));
            } else if (c.length == 5) {
                data.add(new AddNewContact(c[0], c[1], c[2], Integer.parseInt(c[3]), c[c.length - 1]));
            }
        }
    }
}