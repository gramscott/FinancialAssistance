import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {


    User user;
    User userWithNationalInsurance;

    @BeforeEach()
    public void setUp(){
        user = new User("Graeme Scott", LocalDate.of(1996,9,18), "Narnia St",  "111111");
        userWithNationalInsurance = new User("Linda Mooney", LocalDate.of(1970, 3, 28),"star wars st","22222", "G30030");
    }

    @Test
    public void testGetName(){
        assertEquals("Graeme Scott", user.getName());
        user.addName("Allana");
        assertEquals("Allana", user.getName());
    }

    @Test
    public void testGetAddress(){
        assertEquals("Narnia St", user.getAddress());
        user.addCorrespondenceAddress("Narnia St");
        assertEquals("Narnia St", user.getAddress());
    }

    @Test
    public void testGetBankAccount(){
        assertEquals("111111", user.getBankAccount());
        user.addBankAccount("222222222");
        assertEquals("222222222", user.getBankAccount());
    }

    @Test
    public void testGetAge(){
        assertEquals(27, user.getAge());
    }

    @Test
    public void testSetNationalInsuranceNumber(){
        assertTrue(user.isProspect);
        user.setNationalInsuranceNumber("G3hfhfhf");
        assertFalse(user.isProspect);
    }

    @Test
    public void testAddName(){
        user.addName("Jamie");
        assertEquals("Jamie", user.getName());
    }

    @Test
    public void testAddResidentialAddress(){
        user.addResidentialAddress("address");
        assertEquals("address", user.getAddress());
    }

    @Test
    public void testAddCorrespondingAddress(){
        user.addCorrespondenceAddress("Narnia St");
        assertEquals("Narnia St", user.getAddress());
    }

    @Test
    public void testAddBankAccount(){
        user.addBankAccount("111111");
        assertEquals("111111", user.getBankAccount());
    }

    @Test
    public void testNewConstructorWithNationalInsurance(){
        assertEquals("Linda Mooney", userWithNationalInsurance.getName());
        assertEquals(LocalDate.of(1970, 3, 28), userWithNationalInsurance.getDateOfBirth());
        assertEquals("star wars st", userWithNationalInsurance.getAddress());
        assertEquals("22222", userWithNationalInsurance.getBankAccount());
        assertEquals("G30030", userWithNationalInsurance.getNationalInsuranceNumber());
        assertFalse(userWithNationalInsurance.isProspect);
    }







}
