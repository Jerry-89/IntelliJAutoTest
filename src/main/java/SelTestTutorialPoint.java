import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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
    public void checkBoxTest(){
//otvori stranku webu
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php")
//rozkliknutie "+ " tlacitka - toto nema ID takze som skopiroval Xpath
        ovladac.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
        //kliknutie na checkboxy podla ich ID, takisto mozno pouzit Xpath
        ovladac.findElement(By.id("c_bf_1")).click();
        ovladac.findElement(By.id("c_bf_2")).click();
    }


}
