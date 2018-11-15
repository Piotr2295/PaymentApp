import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;

    List<Payment> PaymentList;

    public User(String name, List<Payment> paymentList) {
        this.name = name;
        PaymentList = paymentList;
    }



}
