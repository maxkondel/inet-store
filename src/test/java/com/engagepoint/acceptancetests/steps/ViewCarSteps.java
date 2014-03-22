package com.engagepoint.acceptancetests.steps;

import com.engagepoint.acceptancetest.base.steps.JbehaveBaseSteps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.When;

public class ViewCarSteps extends JbehaveBaseSteps {
    public ViewCarSteps(Pages pages) {
        super(pages);
    }

    @When("user press ajax button")
    public void pressButtpon() {
    }
}
