import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Import2 extends Import1 {
    private String line;
    private String temp;
    private String[] tempArray;
    private ArrayList<String[]> base;
    private final String file2 = "src/DataBlock.txt";

    public Import2() throws FileNotFoundException {
        super();
        super.setReader(new BufferedReader(new FileReader(file2)));
        this.temp = "";
    }

    @Override
    public void readFile() throws IOException {
        try {
            while ((line = super.getReader().readLine()) != null) {
                if (line.length() > 1) {
                    line = line.replace(" ", "");
                    tempArray = line.split(":");
                    temp += tempArray[1] + ",";
                } else {
                    super.getBase().add(temp.split(","));
                    temp = "";
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            super.getReader().close();
        }
    }

    @Override
    public void ghostData() {
        super.ghostData();
    }
}

