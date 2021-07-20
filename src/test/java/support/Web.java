package support;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class Web {
    public static WebDriver navegador;
    protected WebDriverWait wait;
    public String url = "https://www.google.com.br";
    public static String driverPath = "src/test/resources/drivers/chromedriver.exe".replace("/", File.separator);

    @Before
    public void Init() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", driverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200", "--ignore-certificate-errors");
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        navegador = new ChromeDriver(options);
        navegador.manage().window().maximize();
        navegador.get(url);

    }

    public void Finish() {
        navegador.close();
        navegador.quit();
    }
}
