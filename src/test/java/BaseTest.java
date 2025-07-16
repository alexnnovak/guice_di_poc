import org.junit.jupiter.api.BeforeEach;


public class BaseTest extends ScreenFacade{

    @BeforeEach
    void setupWebDriver() {
        baseDriver.setupWebDriver();
    }
}