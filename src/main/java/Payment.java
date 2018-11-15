import java.util.Date;
import java.util.List;

public class Payment {
    private Date duedate;
    private Date actualdate;

    public Payment(Date duedate, Date actualdate) {
        this.duedate = duedate;
        this.actualdate = actualdate;
    }
}
