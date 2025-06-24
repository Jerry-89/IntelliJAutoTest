import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelTestTutorialPoint {

    private WebDriver ovladac;

//vykona sa pred kazdym testom

    @BeforeEach
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\IdeaProjects\\AUtoTest\\src\\main\\resources\\chromedriver.exe");
        ovladac = new ChromeDriver();

    }

    //vykona sa po kazdom teste / funkcia quit nam uzatvori ovladac
    @AfterEach
    public void tearDown() {
        ovladac.quit();

    }

    @Test
    public void checkBoxTest()
}
