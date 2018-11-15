import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadUser {

    List<User> users = new ArrayList<>();
public void CreateList() throws ParseException {
    System.out.println("How many users?");
    Scanner s = new Scanner(System.in);
    int NumberOfUsers = s.nextInt();
    String duedate;


    System.out.println("How many months?");
            int month = s.nextInt();


    for(int i=0;i<NumberOfUsers;i++){
        System.out.println("Set name");
        String name = s.nextLine();
        System.out.println("Set due date");
        duedate = s.nextLine();

        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        Date date = format.parse(duedate);

        List<Payment> payment = new ArrayList<>();
        Payment p = new Payment(date,null);
        payment.add(p);

        for(int j=0; j<month; j++) {
            Date dt = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(dt);
            c.add(Calendar.MONTH, 1);
            dt = c.getTime();
        }


    }




}

    }


