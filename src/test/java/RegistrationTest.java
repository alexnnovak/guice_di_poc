import org.junit.jupiter.api.Test;

import static org.g.example.utils.Generator.randomEmail;

public class RegistrationTest extends BaseTest {

    @Test
    void test() {
        String email = randomEmail("test");
        String password = "Qwer123!";
        mainPage
                .openRegistrationPageByUrl()
                .enterEmail(email)
                .enterPassword(password)
                .clickAcceptTermsCheckbox()
                .clickSignUpButton()

                .clickCloseCrossButton()
                .clickCloseCrossButton()

                .clickProfileButton()
                .clickLimitsButton();
    }
}
