import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {

    PasswordCheck passwordCheck = new PasswordCheck();

    @Test
    void passwordIsValid() {
        String password = "@0Tmhhhhhhhh";
        passwordCheck.passwordIsValid(password);
        assertEquals(6, passwordCheck.c, "Are all the conditions met?");
    }

    @Test
    void passwordIsOk() {
        String password = "@2Thhhhhhh";
        passwordCheck.passwordIsValid(password);
        assertTrue(passwordCheck.passwordIsOk());
    }
}