package HomeWork7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class TestAutorization extends AbstractPageData{
    @FindBy(id = "input-email ")
    private WebElement email;

    @FindBy(id = "input-password")
    private WebElement password;

    @FindBy(id = "submit-button")
    private WebElement submit;


    @Test
    public TestAutorization() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AbstractPageData getAbstractPageData = new AbstractPageData();
        driver.get("https://velesmoda.ru/index.php?route=account/login");

        public void AbstractPageData(WebDriver driver){

            super(driver);
        }

        public void loginIn(){
            this.submit.click();
        }

        public HomeWork7.TestAutorization setEmail(String email){
            this.email.sendKeys(email);
            return this;
        }

        public HomeWork7.TestAutorization setPassword(String password){
            this.password.click();
            this.passwordInput.sendKeys(password);
            return this;
        }


        // driver.quit();

    }
}

}
