package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class stepsdefanation {

	WebDriver driver;

@Given("user launch browser")
public void user_launch_browser() {
	driver =new ChromeDriver () ;
	driver.manage().window().maximize();

    
}

@Then("user enter url as {string}")
public void user_enter_url_as(String applicationUrl) {
	driver.get(applicationUrl);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}


@Then("user enter username as {string} and password as {string} and clicks login as button")
public void user_enter_username_as_and_password_as_and_clicks_login_as_button(String userName, String password) {
	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

}


@Then("user go to skils page")
public void user_go_to_skils_page() {
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
	driver.findElement(By.xpath("//a[text()='Skills']")).click();
	driver.findElement(By.xpath("//button[text()=' Add ']")).click();
}



@Then("user enters skils name as {string} and description as {string} and click on save button")
public void user_enters_skils_name_as_and_description_as_and_click_on_save_button(String name, String jobDescription) {
	driver.findElement(By.xpath("//div[@class=\"oxd-input-group oxd-input-field-bottom-space\"]/child::div[2]/input")).sendKeys(name);
	driver.findElement(By.xpath("//textarea[@placeholder=\"Type description here\"]")).sendKeys(jobDescription);
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	
}


@Then("click on login button")
public void click_on_login_button() {
    
}
@Then("close the browser")
public void close_the_browser() {
    
}

}
