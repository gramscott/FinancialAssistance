import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {


    User user1;

    User user2;

    BankAccount bankAccount1;

    Address address1;


    @BeforeEach()
    public void setUp(){
        user1 = new User("Graeme Scott", LocalDate.of(1996,9,18), "G3902923", address1, address1, bankAccount1, true);
        address1 = new Address("Narnia Road", "South Lanarkshire", "Ml11 9LQ");
        bankAccount1 = new BankAccount("12345678", "22-22-22");
    }

    @Test
    public void testUserCreation(){

    }




}
