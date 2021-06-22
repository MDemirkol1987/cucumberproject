package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(css = ".a-section.a-spacing-small.a-spacing-top-small:nth-child(1)")
    public WebElement sonucYazisiElementi;
}