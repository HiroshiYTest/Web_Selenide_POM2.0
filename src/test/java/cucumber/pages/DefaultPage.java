package cucumber.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DefaultPage {
    public SelenideElement applogoDiv = $x("//div[@class='app_logo']");
    public SelenideElement shoppingcartIcon = $x("//a[@class='shopping_cart_link']");
    public SelenideElement inventorylist = $x("//div[@class='inventory_list']");
    public SelenideElement inventoryitem = $x("//div[@class='inventory_item']");
    public SelenideElement inventoryitemDiv1 = $x("//div[@class='inventory_item'][.//*[@id='item_4_img_link']]");
    public SelenideElement inventoryitemDiv2 = $x("//div[@class='inventory_item'][.//*[@id='item_0_img_link']]");
    public SelenideElement addToCartSauceLabsBackpackButton = $x("//*[@id='add-to-cart-sauce-labs-backpack']");
    public SelenideElement addToCartSauceLabsBikeLightButton2 = $("button.btn.btn_primary.btn_small.btn_inventory");
    public SelenideElement addToCartButton = $(byText("Add to cart"));

}
