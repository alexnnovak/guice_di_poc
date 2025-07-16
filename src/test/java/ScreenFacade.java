import com.google.inject.Guice;
import com.google.inject.Injector;
import org.g.example.binds.ScreenModule;
import org.g.example.driver.BaseDriver;
import org.g.example.pages.common.MainPage;

public class ScreenFacade {

    // Create Guice injector with ScreenModule
    Injector injector = Guice.createInjector(new ScreenModule());

    protected MainPage mainPage = injector.getInstance(MainPage.class);

    protected BaseDriver baseDriver = new BaseDriver();
}