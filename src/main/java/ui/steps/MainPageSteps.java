package ui.steps;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;
import ui.pages.MainPage;

@Name("Main page steps")
public class MainPageSteps extends StepLibrary {

    private MainPage mainPage;

    public void i_open_the_main_page() {
        String url = getConfigurationValue("ibello.url.base").toString();
        mainPage.opening_$_page(url);
    }

    public void i_am_on_main_page() {
        mainPage.i_expect_that_main_page_is_visible();
    }

}
