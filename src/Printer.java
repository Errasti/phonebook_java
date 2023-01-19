public class Printer {
    private String string;

    public Printer(String string) {
        this.string = string;
    }

    public void print(){
        System.out.println(this.string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
