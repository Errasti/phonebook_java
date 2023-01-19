public class Number {
    private int numberHome = 0;
    private int numberMobile = 0;
    private int numberWork = 0;

    public Number(int numberHome) {
        this.numberHome = numberHome;
    }

    public Number(int numberHome, int numberMobile) {
        this.numberHome = numberHome;
        this.numberMobile = numberMobile;
    }

    public Number(int numberHome, int numberMobile, int numberWork) {
        this.numberHome = numberHome;
        this.numberMobile = numberMobile;
        this.numberWork = numberWork;
    }

    public Number() {
    }

    public int getNumberHome() {
        return numberHome;
    }

    public void setNumberHome(int numberHome) {
        this.numberHome = numberHome;
    }

    public int getNumberMobile() {
        return numberMobile;
    }

    public void setNumberMobile(int numberMobile) {
        this.numberMobile = numberMobile;
    }

    public int getNumberWork() {
        return numberWork;
    }

    public void setNumberWork(int numberWork) {
        this.numberWork = numberWork;
    }
}