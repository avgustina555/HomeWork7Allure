package HomeWork7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AbstractPageData {
        protected WebElement passwordInput;
        private WebDriver driver;

        public AbstractPageData(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public String getUrl = "https://velesmoda.ru/index.php?route=account/register";
        public String lastName = "Dmitriuk";
        public String firstName = "Vera";
        public String email = "avgustina.67@mail.ru" ;
        public String telephone = "89145208512";
        public String password = "bc4V9i3s";
        public String confirm = "bc4V9i3s";

        public String checkbox = "true";

        protected WebDriver getDriver(){
            return this.driver;
        }
    }

