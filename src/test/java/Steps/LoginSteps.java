package Steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends CommonMethods {
    @Given("the user navigates to the url")
    public void the_user_navigates_to_the_url() {
    openBrowserAndLaunchApplication();
}
    @When("user enters  valid email and password")
    public void user_enters_valid_email_and_password() {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(passwordTextBox,ConfigReader.getPropertyValue("password"));

}
    @When("clicks on login Button")
    public void clicks_on_login_button() {
        WebElement loginbtn = driver.findElement(By.id("btnLogin"));
        doClick(loginbtn);


}
    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        //assertion that you are logged in
        System.out.println("logged in");

}
@When("user enters a valid email {string} and password {string}")
    public void user_enters_a_valid_email_and_password(String username, String password) {
        WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
        WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
        sendText(usernameTextBox,username);
        sendText(passwordTextBox,password);
    }
    @When("user enters a username {string} and password {string}")
    public void user_enters_a_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the user is not logged in")
    public void the_user_is_not_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
