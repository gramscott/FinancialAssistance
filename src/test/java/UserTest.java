import org.aspectj.lang.annotation.Before;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserTest {


    User user1;

    User user2;

    @Before
    public void setUp(){
        user1 = new User(LocalDateTime.now(), "Graeme Scott", LocalDate.of(1996,18,9), "")
    }
}
