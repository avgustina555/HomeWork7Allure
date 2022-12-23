package HomeWork7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class TestRegistration extends AbstractPageData {
    // private By btnRegister = By.xpath("//div[@class ='<a href=\"https://velesmoda.ru/index.php?route=account/register\'] ");
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-lastname'] ");
    private WebElement lastname;
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-firstname'] ");
    private WebElement firstname;
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-email'] ");
    private WebElement email;
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-telephone'] ");
    private WebElement telephone;
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-password'] ");
    private WebElement password;
    @FindBy(xpath = "//div[@class ='col-sm-9']//input[@id = 'input-confirm'] ");
    private WebElement confirm;

    // private By CheckBox = By.xpath("//div[@class ='recaptcha-checkbox-borderAnimation']//input[@id = 'recaptcha-anchor'] ");

    @FindBy(xpath = "//div[@class ='text-center']//input[@type = 'submit'] ");
    private WebElement submit;

    public void AbstractPageData(WebDriver driver) {
        super(driver);
    }

    @Test
    public void Registration () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.get("https://google.com");

        AbstractPageData getAbstractPageData = new AbstractPageData();
        driver.get(getAbstractPageData.getUrl);
        // driver.findElement(btnRegister).click();

        public void loginIn (String lastname, String firstname, String email, String telefone, String
        password, String confirm){

            Actions loginIn = new Actions(getDriver());
            loginIn
                    .sendKeys(this.lastName, lastName)
                    .click(this.lastName)
                    .sendKeys(firstname)
                    .sendKeys(email)
                    .sendKeys(telephone)
                    .sendKeys(password)
                    .sendKeys(confirm)
                    .click(this.submit)
                    .build()
                    .perform();


            // driver.quit();
        }
    }

}



