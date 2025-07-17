import com.google.inject.Guice;
import com.google.inject.Injector;
import org.g.example.binds.drivers.DriverModule;
import org.g.example.binds.screen.ScreenModule;
import org.g.example.driver.BaseDriver;
import org.g.example.pages.common.MainPage;

public class ScreenFacade {

    /* Create Guice injector for ScreenModule (Place where we define which implementation we will use.
    I.E. desktop, viewport or native devices.
    Also, here we pick a correct driver for the devices based on the profiles settings in this case. It helps to
    reduce "IF" statements in tests.
     */
    Injector injector = Guice.createInjector(new ScreenModule());
    Injector injectedDriver = Guice.createInjector(new DriverModule());

    protected BaseDriver baseDriver = injectedDriver.getInstance(BaseDriver.class);

    protected MainPage mainPage = injector.getInstance(MainPage.class);

}