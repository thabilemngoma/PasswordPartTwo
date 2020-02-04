import java.util.Scanner;
import org.apache.logging.log4j.*;
public class PasswordCheck {
    boolean existence = true, longer = true, lowerCase = true, upperCase = true, digit = true, character = true;

    int c = 6;

    PasswordValidation validations = new PasswordValidation();
    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    void passwordIsValid(String password)  {

        if (!validations.existence(password)) {
            logger.error("1. Password should exist.");
            existence = false;
            c--;
        }
        if (!validations.longer(password)) {
            logger.error("2. Password should be longer than than 8 characters.");
            longer = false;
            c--;
        }
        if (!validations.lowerCase(password)) {
            logger.error("3. Password should have at least one lowercase letter.");
            lowerCase = false;
            c--;
        }
        if (!validations.upperCase(password)) {
            logger.error("4. Password should have at least one uppercase letter.");
            upperCase = false;
            c--;
        }
        if (!validations.digit(password)) {
            logger.error("5. Password should have at least have one digit.");
            digit = false;
            c--;
        }
        if (!validations.character(password)) {
            logger.error("6. Password should have at least one special character.");
            character = false;
            c--;
        }
        if (existence && longer && lowerCase && upperCase && digit && character) {
            System.out.println("Password meets all the minimum requirements.");
        }
    }

    boolean passwordIsOk() {

        boolean results = true;
        if (c < 3) {
            results = false;
        }
        return results;
    }

}