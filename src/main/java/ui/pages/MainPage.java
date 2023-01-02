package ui.pages;

import hu.ibello.core.Name;
import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

@Name("Main page")
public class MainPage extends PageObject {

    @Find(by = By.CLASS_NAME, using = "indexhu")
    private WebElement indexhu;

        public void opening_$_page(String url) {
            browser().openURL(url);
            browser().resize(1600, 1080);
            browser().maximize();
        }

        public void i_expect_that_main_page_is_visible() {
            expectations().expect(indexhu).toBe().displayed();
        }

}
