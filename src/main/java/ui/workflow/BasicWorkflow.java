package ui.workflow;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;
import ui.steps.MainPageSteps;

@Name("basic")
public class BasicWorkflow extends StepLibrary {

    private MainPageSteps mainPageSteps;

    @Name("i open the page")
    public void i_open_the_page() {
        mainPageSteps.i_open_the_main_page();
    }

    @Name("the page is visible")
    public void the_page_is_visible() {
        mainPageSteps.i_am_on_main_page();
    }

}
