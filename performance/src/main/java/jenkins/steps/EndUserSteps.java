package jenkins.steps;

import jenkins.pages.DictionaryPage;
import jenkins.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    DictionaryPage dictionaryPage;
    SearchPage searchPage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void go_to_google() {
        dictionaryPage.go_google();
    }

    @Step
    public void search_cheese() {
        dictionaryPage.search_cheese();
    }

    @Step
    public void is_amazon_page(){
        searchPage.go_to_amazon();
    }

    @Step
    public void search_for_book(String book){
        searchPage.search_book(book);
    }

    @Step
    public void validate_results(){
        searchPage.validate_results();
    }

    @Step
    public void add_item_to_cart(){
        searchPage.add_item_to_cart();
    }

    @Step
    public void verify_item_added(){
        searchPage.verify_item_added();
    }
}