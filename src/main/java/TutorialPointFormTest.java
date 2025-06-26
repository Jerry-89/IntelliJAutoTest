import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


public class TutorialPointFormTest {

    private WebDriver ovladac;

    @Before
    public void totoPredKazdymTestom(){
        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();

    @Given("Uzivatel je na stranke tutorialspoint student form")
    }
    public void uzivatelJeNaStrankeTutorialspointStudentForm() {
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @When("Uzivatel zada svoje meno {string}")
    public void uzivatelZadaSvojeMenoName(String meno) {
        ovladac.findElement(By.id("name")).sendKeys(meno);
    }

    @And("Uzivatel zada svoj email {string}")
    public void uzivatelZadaSvojEmailEmail(String email) {
        ovladac.findElement(By.id("email")).sendKeys(email);
    }

    @And("Uzivatel klikne na pohlavie {string}")
    public void uzivatelKlikneNaPohlavie(String pohlavie) {
        if (pohlavie.equals("male"){
            ovladac.findElement(By.id("gender")).click();

        }
        else if(pohlavie.equals("female")) {
            ovladac.findElement(By.xpath("//*[@id="practiceForm"]/div[3]/div/div/div[2]/input")).click();

        }
    }

    @Then("Radiobutton Male je zaciarknute")
    public void radiobuttonMaleJeZaciarknute() {
        assertTrue(ovladac.findElement(By.id("gender")).isSelected());
    }

    @Then("Radiobutton Male je odskrtnuty")
    public void radiobuttonMaleJeOdskrtnuty() {
    }
}
