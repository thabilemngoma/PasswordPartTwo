import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class PasswordValidationTest {
    PasswordValidation validations = new PasswordValidation();

    @Test
    void existence() {
        String password = "lyert";

        assertTrue(validations.existence(password));
    }

    @Test
    void longer() {
        String password = "hdhkltgq";
        assertTrue(validations.longer(password));
    }

    @Test
    void lowerCase() {
        String password = "KHHHHHk";
        assertTrue(validations.lowerCase(password));
    }

    @Test
    void upperCase() {
        String password = "Ahytrefdsh";
        assertTrue(validations.upperCase(password));
    }

    @Test
    void digit() {
        String password = "hh^rr56";
        assertTrue(validations.digit(password));
    }

    @Test
    void character() {
        String password = "ljjf@kjhkkj";
        assertTrue(validations.character(password));
    }
}