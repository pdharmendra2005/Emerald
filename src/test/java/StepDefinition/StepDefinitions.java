package StepDefinition;


import EmeraldUtil.Utility.Util;
import EmeraldUtil.Webpages.EmeraldInsight;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

  EmeraldInsight emeraldInsight;

  public StepDefinitions(){
    emeraldInsight = new EmeraldInsight();
  }

  @Given("I am on emerald insight search result page")
  public void i_am_on_emerald_insight_search_result_page() {
      emeraldInsight.goToHomePage();
  }

  @Then("I should navigate to emerald insight page")
  public void i_should_navigate_to_emerald_insight_page() {
    Assert.assertTrue(emeraldInsight.isUserOnInsightPage());
  }

  @When("I enter from {string} to {string} and click Go Button")
  public void i_enter_from_to_and_click_go_button(String fromYearValue, String toYearValue) {
    emeraldInsight.enterFromAndToYear(fromYearValue, toYearValue);
    Util.waitTime(20);
    emeraldInsight.clickGoButton();
  }

  @Then("I should see Search Result & Number of Articles")
  public void i_should_see_search_result_number_of_articles() {
    Assert.assertTrue(emeraldInsight.articleTotalDisplayed());

  }


  @Then("I should see an {string}")
  public void iShouldSeeAn(String errMessage) {

  }


}
