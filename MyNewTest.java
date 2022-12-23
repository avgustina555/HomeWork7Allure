package HomeWork7;

import io.qameta.allure.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@Story("Мой новый тест")

public class MyNewTest extends AbstractPageData {
    @Test
    @DisplayName("Регистрация на сайте")
    @Description("Новый тест")
    @Link("http://google.com")
    @Issue("https://velesmoda.ru/index.php?route=account/register")
    @Severity(SeverityLevel.MINOR)
    void testTrue(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Скрин")
    @Description("Тест создает скрин")
    @Link("http://google.com")
    @Issue("https://velesmoda.ru")
    @Severity(SeverityLevel.BLOCKER)
    void testFalse() throws InterruptedException, IOException {
        Thread.sleep(1000);
        File file = MyUtils.makeScreenshot(getWebDriver(),"failure- org.example.velesmoda.MyNewTest.testFalse" + System.currentTimeMillis() + ".png");
        saveScreenshot(Files.readAllBytes(file.toPath()));
        Assertions.assertTrue(true);
    }

    @Step("Степ 1")
    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
    @Test
    @DisplayName("Авторизация")
    @Description("Авторизуемся на сайте")
    @Link("http://google.com")
    @Issue("https://velesmoda.ru/index.php?route=account/login")
    @Severity(SeverityLevel.NORMAL)
    void testLogs(){
        LogEntries browserLogs = getWebDriver().manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
            if (allLogRows.size() > 0 ) {
            allLogRows.forEach(logEntry -> {
                System.out.println(logEntry.getMessage());
            });

        }

        public WebDriver getWebDriver(){
            return this.webDriver();
        }
    }

    private void webDriver() {
    }
    // driver.quit();
}