import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
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
        user = new User("Graeme Scott", LocalDate.of(1996,9,18), "Narnia St",  "111111");
    }

    @Test
    public void testGetActiveName(){
        assertEquals("Graeme Scott", user.getActiveName());
        user.addName("Allana");
        assertEquals("Allana", user.getActiveName());
    }

    @Test
    public void testGetActiveAddress(){
        assertEquals("Narnia St", user.getActiveAddress());
        user.addCorrespondenceAddress("Narnia St");
        assertEquals("Narnia St", user.getActiveAddress());
    }

    @Test
    public void testGetActiveBankAccount(){
        assertEquals("111111", user.getActiveBankAccount());
        user.addBankAccount("222222222");
        assertEquals("222222222", user.getActiveBankAccount());
    }








}
