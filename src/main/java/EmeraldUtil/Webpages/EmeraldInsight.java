package EmeraldUtil.Webpages;


import EmeraldUtil.Utility.Util;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmeraldInsight extends BasePages{

  public EmeraldInsight(){
    driverWait = new WebDriverWait(driver, 20);
    PageFactory.initElements(driver, this);
    }

  @FindBy ( xpath = "//a[contains(text(),'Browse our content')]")
  WebElement browseContent;

  @FindBy( css = "#yearFrom")
  WebElement yearFrom;

  @FindBy ( css = "#yearTo")
  WebElement yearTo;

  @FindBy ( xpath = "//a[contains(text(),'Go')]")
  WebElement clickGo;

  @FindBy ( xpath = "//a[contains(text(),'Article')]")
  WebElement articleTotal;

  public void goToHomePage() {
    driver.get(baseUrl);

  }

  public boolean isUserOnInsightPage() {
    return Util.isDisplayed(browseContent);
  }

  public void enterFromAndToYear( String fromYear , String toYear){

    Util.waitTime(20);
    driver.getWindowHandle();
    yearFrom.sendKeys(fromYear);
  //  driver.switchTo().alert().accept();
    Util.waitTime(20);
    yearTo.sendKeys(toYear);

   // Alert alert = driver.switchTo().alert();
   // alert.accept();


  }
  public void clickGoButton(){
    Util.click(clickGo);
  }
  public boolean articleTotalDisplayed(){
    return Util.isDisplayed(articleTotal);

  }

}
