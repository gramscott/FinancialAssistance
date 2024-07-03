import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {


    User user;

    BankAccount bankAccount;

    Address address;


    @BeforeEach()
    public void setUp(){
        user = new User("Graeme Scott", new Date(1996,9,18), address,  bankAccount);
        address = new Address("Narnia Road", "South Lanarkshire", "Ml11 9LQ");
        bankAccount = new BankAccount("12345678", "22-22-22");
    }

    @Test
    public void testUserCreation(){
        assertEquals("Graeme Scott", user.getName());
        assertEquals(address, user.getResidentialAddress());
        assertEquals(bankAccount, user.getBankAccount());
        assertTrue(user.isProspect());

    }






}
