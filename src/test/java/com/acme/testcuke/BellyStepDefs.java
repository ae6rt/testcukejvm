package com.acme.testcuke;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.Assert.assertEquals;

/**
 * petrovic, 5/6/12, 8:25 PM
 */
public class BellyStepDefs {
    private final Belly belly;

    @Autowired
    private BellyBean bellyBean;

    @Autowired
    public BellyStepDefs(final Belly belly) {
        this.belly = belly;
        System.out.println("### F");
    }

    @Given("^I have (\\d+) beans in my belly$")
    public void I_have_beans_in_my_belly(int n) {
        bellyBean.setCukes(n);
        System.out.println("### A");
    }

    @Then("^there are (\\d+) beans in my belly$")
    public void there_are_beans_in_my_belly(int n) {
        assertEquals(n, bellyBean.getCukes());
        System.out.println("### B");
    }

    //

    @Given("^I have (\\d+) cukes in my belly")
    public void haveCukes(final int n) {
        belly.setCukes(n);
        System.out.println("### C");
    }

    @Then("^there are (\\d+) cukes in my belly")
    public void checkCukes(final int n) {
        assertEquals(n, belly.getCukes());
        System.out.println("### D");
    }

}
