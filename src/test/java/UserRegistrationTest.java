import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    public void FirstName_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.validateFirstName("kshay");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenNotProperFormat_ShouldThrowException() {
    try {
        UserRegistration validator = new UserRegistration();
        boolean lastName=validator.validateLastName("Zagade Akshay");
        Assertions.assertEquals(true,lastName);
    } catch (CustomException e) {
        System.out.println(e.getMessage());
    }
    }
    @Test
    public void givenMobileNumber_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {

            boolean result = validator.vaildateMobileNumber("919739713842");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenNotProperFormat_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.vaildatePassword("@Pass++..word123");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldThrowException() {
        UserRegistration validator = new UserRegistration();
        try {
            boolean result = validator.vaildateEmail("Ak+shay@panchal..com");
            Assertions.assertEquals(true, result);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
