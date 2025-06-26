import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPointFormTest {

    private WebDriver ovladac;

    @Before
    public void totoPredKazdymTestom(){
        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();

    @Given("Uzivatel je na stranke tutorialspoint student form")
    }
    public void uzivatelJeNaStrankeTutorialspointStudentForm() {
    }

    @When("Uzivatel zada svoje meno {string}")
    public void uzivatelZadaSvojeMenoName(String arg0) {
    }

    @And("Uzivatel zada svoj email {string}")
    public void uzivatelZadaSvojEmailEmail(String arg0) {
    }

    @And("Uzivatel klikne na pohlavie {string}")
    public void uzivatelKlikneNaPohlavie(String arg0) {
    }

    @Then("Radiobutton Male je zaciarknute")
    public void radiobuttonMaleJeZaciarknute() {
    }

    @Then("Radiobutton Male je odskrtnuty")
    public void radiobuttonMaleJeOdskrtnuty() {
    }
}
