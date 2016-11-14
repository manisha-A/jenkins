package jenkins.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by manishaawasthi on 24/03/2015.
 */
public class SearchPage extends PageObject {
    @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void go_to_amazon() {
        getDriver().get("http://www.amazon.co.uk");
    }

    public void search_book(String book) {
        WebElement searchInput = getDriver().findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys(book);
        searchInput.submit();
    }

    public void validate_results() {
        WebElement filter = getDriver().findElement(By.id("refinesdfsdfments"));
        assert !(filter.getText().toString().contains("Showccvbcv results for"));
    }

    public void add_item_to_cart() {
        List<WebElement> resultSet = getDriver().findElements(By.linkText("How Google Tests Software"));
        resultSet.get(0).click();
    }

    public void verify_item_added() {
        WebElement buybox = getDriver().findElement(By.id("buybox"));
        assert buybox.isEnabled();

        //Add to Cart
        WebElement addCart = getDriver().findElement(By.id("add-to-cart-button"));
        addCart.click();

        //Verify Item is added
        WebElement confirmationAlert = getDriver().findElement(By.id("confirm-text"));
        assert confirmationAlert.getText().toString().equals("1 item was added to your basket");
    }


}
