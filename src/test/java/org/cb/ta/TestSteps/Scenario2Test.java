package org.cb.ta.TestSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.cb.ta.CodingBookMainPage;
import org.testng.Assert;

public class Scenario2Test extends BaseTest {
    CodingBookMainPage codingBookMainPage;

    @Given("User opens CodingBook web page1")
    public void user_opens_coding_book_web_page1() {
        this.codingBookMainPage = new CodingBookMainPage(driver);
        Assert.assertEquals(driver.getTitle(),"CodingBook – Shape your future");
    }
    @When("User checks if CodingBook LinkedIn icon is visible on the top right corner")
    public void user_checks_if_coding_book_linked_in_icon_is_visible_on_the_top_right_corner() {

    }

    @When("User clicks CodingBook LinkedIn icon")
    public void user_clicks_coding_book_linked_in_icon() {

    }

    @Then("Test if user landed CodingBook LinkedIn page")
    public void test_if_user_landed_coding_book_linked_in_page() {

    }


}
