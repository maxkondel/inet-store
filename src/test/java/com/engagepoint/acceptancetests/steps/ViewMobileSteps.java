package com.engagepoint.acceptancetests.steps;

import com.engagepoint.acceptancetest.base.steps.JbehaveBaseSteps;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.When;

public class ViewMobileSteps extends JbehaveBaseSteps {
    public ViewMobileSteps(Pages pages) {
        super(pages);
    }

    @When("user press ajax button")
    public void pressButtpon() {
    }
}
