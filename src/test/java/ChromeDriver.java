import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Duration;
class AutomationProjectOne {
    private static DriverManager BrowserFactory;

    public static void main(String[] args) throws InterruptedException, SQLException {

        String browser = "chrome";

        WebDriver driver = (WebDriver) DriverManager.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://practice.cybertekschool.com/registration_form");

        String firstName = "John";
        String lastName = "Smith";


        driver.findElement(By.name("firstName")).sendKeys(firstName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);

        String email = "";
        String password = "";

        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("password2")).sendKeys(password);

        driver.findElement(By.name("registerButton")).click();
        Thread.sleep(2000);

        String expectedMessage = "Your username must be between 5 and 25 characters";

        String actualMessage = driver.findElement(By.id("usernameError")).getText();

        Assert.assertEquals(actualMessage, expectedMessage);

        driver.quit();


    }
}
