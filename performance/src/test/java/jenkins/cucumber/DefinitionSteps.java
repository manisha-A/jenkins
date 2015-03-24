package jenkins.cucumber;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import jenkins.steps.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("^the user is on amazon website$")
    public void the_user_is_on_amazon_website(){
        endUser.is_amazon_page();
    }

    @When("^user search for '(.*)'$")
    public void user_search_for_How_google_tests_software(String book){
        endUser.search_for_book(book);
    }

    @Then("^user should see search result$")
    public void user_should_see_search_result() {
        endUser.validate_results();
    }

    @When("^user adds first item to cart$")
    public void user_adds_first_item_to_cart() {
        endUser.add_item_to_cart();
    }

    @Then("^then book should be added to cart$")
    public void then_book_should_be_added_to_cart(){
        endUser.verify_item_added();
    }
}
