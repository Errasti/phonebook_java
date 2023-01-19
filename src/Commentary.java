import java.util.Date;

public class Commentary {
    String comment = null;
    Date date = null;


    public Commentary(String comment) {
        this.comment = comment;
        this.date = new Date();
    }

    public Commentary() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }
}