package StepDefinition;


import EmeraldUtil.Webpages.BasePages;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BasePages {

  @Before
  public void openBrowser(){
    startBrowser(browserType);
  }

  @After
  public void quitBrowser() {
   // Thread.sleep(500);
    driver.close();

  }



}
