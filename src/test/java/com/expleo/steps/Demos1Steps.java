package com.expleo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demos1Steps {

    @Given("I am an authenticated github user")
    public void i_am_an_authenticated_github_user() {
        System.out.println("Given I am an authenticated github user");

    }
    @When("I send the request to create a repository with name as {string} and with the description {string}")
    public void i_send_the_request_to_create_a_repository_with_name_as_and_with_the_description(String repoName, String description) {
        System.out.println("When" +repoName+ "with" + description);
    }
    @Then("the response code should be {int}")
    public void the_response_code_should_be(Integer expectedStatusCode) {
        System.out.println("then" + expectedStatusCode);
    }
    @Then("the response should contain the respository name {string}")
    public void the_response_should_contain_the_respository_name(String expectedRepoName) {
        System.out.println("then" + expectedRepoName);
    }
    @Then("the response time should be less than {int} milliseconds")
    public void the_response_time_should_be_less_than_milliseconds(Integer expectedResponseTime) {
        System.out.println("then" + expectedResponseTime);
    }

}
