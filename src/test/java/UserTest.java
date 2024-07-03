import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserTest {


    User user1;

    User user2;

    @Before("User")
    public void setUp(){
        user1 = new User(LocalDateTime.now(), "Graeme Scott", LocalDate.of(1996,18,9), "123 Main St", "12345");
    }

    @Test
    public void testName(){

    }
}
