import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private String input = null;

    public UserInput(String input) {
        this.input = input;
    }

    public UserInput() {
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return input;
    }

    public void UInput(String s) {
        System.out.printf("%s ", s);
        setInput(scanner.nextLine());
    }

    public boolean isInteger() {
        return this.getInput().matches("^[0-9]+$");
    }

    public boolean isDate() {
        return this.getInput().matches("^\\d{1,2}\\.\\d{2}\\.\\d{4}");
    }
}
